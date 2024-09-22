package study.jvecodev.maratonajava.SistemasAcademicos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSisAcademico {
    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();

    public static void main(String[] args) {
        inicializarProfessoresEDisciplinas();
        menu();
    }

    private static void inicializarProfessoresEDisciplinas() {
        Professor professor1 = new Professor("Marina", "marina@example.com", 35, "RH001", "Doutor");
        Professor professor2 = new Professor("Cristina", "cristina@example.com", 40, "RH002", "Mestre");
        Professor professor3 = new Professor("Ricardo", "ricardo@example.com", 40, "RH003", "Doutor");
        Professor professor4 = new Professor("Cleber", "cleber@example.com", 40, "RH004", "Mestrado");
        Professor professor5 = new Professor("Adalto", "adalto@example.com", 40, "RH005", "Doutor");

        Disciplina disciplina1 = new Disciplina("POO", 101, "Bloco A", 202, professor1);
        Disciplina disciplina2 = new Disciplina("Banco de Dados", 102, "Bloco B", 203, professor2);
        Disciplina disciplina3 = new Disciplina("Matemática Discreta", 103, "Bloco B", 205, professor3);
        Disciplina disciplina4 = new Disciplina("Desenvolvimento Web", 104, "Bloco C", 205, professor4);
        Disciplina disciplina5 = new Disciplina("Filosofia", 105, "Bloco D", 50, professor5);

        listaDisciplinas.add(disciplina1);
        listaDisciplinas.add(disciplina2);
        listaDisciplinas.add(disciplina3);
        listaDisciplinas.add(disciplina4);
        listaDisciplinas.add(disciplina5);
    }

    private static void menu() {
        while (true) {
            System.out.print("(1) Matricular Aluno \n" +
                    "(2) Trancar Matéria \n" +
                    "(3) Pesquisar Disciplina \n" +
                    "(4) Pesquisar Aluno \n" +
                    "(5) Alterar Dados Cadastrais \n" +
                    "(6) Pesquisar Professor \n" +
                    "(7) Sair\n");
            System.out.println("");
            System.out.print("Digite sua opção:");
            String opcao = scanner.nextLine().trim();

            System.out.println("=================================================");
            switch (opcao) {
                case "1":
                    matricularAluno();
                    break;
                case "2":
                    trancarMateria();
                    break;
                case "3":
                    pesquisarDisciplina();
                    break;
                case "4":
                    pesquisarAluno();
                    break;
                case "5":
                    alterarDadosCadastrais();
                    break;
                case "6":
                    pesquisarProfessor();
                    break;
                case "7":
                    sairDoSistema();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void matricularAluno() {
        System.out.print("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno:");
        int matriculaAluno = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o curso do aluno:");
        String cursoAluno = scanner.nextLine();

        Aluno novoAluno = new Aluno(nomeAluno, matriculaAluno, cursoAluno);

        System.out.print("Escolha a disciplina para matricular o aluno:\n");
        for (int i = 0; i < listaDisciplinas.size(); i++) {
            System.out.println("(" + (i + 1) + ") " + listaDisciplinas.get(i).getNome());
        }
        System.out.println("");

        int escolhaDisciplina = Integer.parseInt(scanner.nextLine()) - 1;

        if (escolhaDisciplina >= 0 && escolhaDisciplina < listaDisciplinas.size()) {
            Disciplina disciplinaEscolhida = listaDisciplinas.get(escolhaDisciplina);
            disciplinaEscolhida.matricularAluno(novoAluno);
        } else {
            System.out.println("Opção inválida. Tente novamente.");
            matricularAluno();
        }
    }

    private static void trancarMateria() {
        System.out.print("Digite a matrícula do aluno:");
        int matriculaAluno = Integer.parseInt(scanner.nextLine());

        Aluno aluno = encontrarAlunoPorMatricula(matriculaAluno);
        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Escolha a disciplina para trancar:\n");
        for (int i = 0; i < listaDisciplinas.size(); i++) {
            System.out.println("(" + (i + 1) + ") " + listaDisciplinas.get(i).getNome());
        }
        System.out.println("");

        int escolhaDisciplina = Integer.parseInt(scanner.nextLine()) - 1;

        if (escolhaDisciplina >= 0 && escolhaDisciplina < listaDisciplinas.size()) {
            Disciplina disciplinaEscolhida = listaDisciplinas.get(escolhaDisciplina);
            disciplinaEscolhida.trancarAluno(aluno);
        } else {
            System.out.println("Opção inválida. Tente novamente.");
            trancarMateria();
        }
    }

    private static void pesquisarDisciplina() {
        System.out.print("Digite o nome da disciplina:");
        String nomeDisciplina = scanner.nextLine();

        for (Disciplina disciplina : listaDisciplinas) {
            if (disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
                disciplina.exibirInformacoesDisciplina();
                return;
            }
        }

        System.out.println("Disciplina não encontrada.");
    }

    private static void pesquisarAluno() {
        System.out.print("Digite a matrícula do aluno:");
        int matriculaAluno = Integer.parseInt(scanner.nextLine());

        Aluno aluno = encontrarAlunoPorMatricula(matriculaAluno);
        if (aluno != null) {
            aluno.exibirInformacoesAluno();
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private static Aluno encontrarAlunoPorMatricula(int matricula) {
        for (Disciplina disciplina : listaDisciplinas) {
            for (Aluno aluno : disciplina.getListaAlunos()) {
                if (aluno.getMatricula() == matricula) {
                    return aluno;
                }
            }
        }
        return null;
    }

    private static void alterarDadosCadastrais() {
        System.out.print("Digite a matrícula do aluno:");
        int matriculaAluno = Integer.parseInt(scanner.nextLine());

        Aluno aluno = encontrarAlunoPorMatricula(matriculaAluno);
        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Digite o novo nome (ou deixe em branco para não alterar):");
        String novoNome = scanner.nextLine();

        System.out.print("Digite o novo curso (ou deixe em branco para não alterar):");
        String novoCurso = scanner.nextLine();

        aluno.alterarDadosCadastrais(novoNome, novoCurso);
        System.out.println("Dados cadastrais atualizados com sucesso.");
    }
    private static void pesquisarProfessor() {
        System.out.print("Digite o nome do professor:");
        String nomeProfessor = scanner.nextLine();

        for (Disciplina disciplina : listaDisciplinas) {
            Professor professor = disciplina.getProfessor();
            if (professor.getNome().equalsIgnoreCase(nomeProfessor)) {
                professor.exibirInformacoesProfessor();
                return;
            }
        }

        System.out.println("Professor não encontrado.");
    }



    private static void sairDoSistema() {
        System.out.println("Saindo do sistema...");
    }
}
