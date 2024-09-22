package study.jvecodev.maratonajava.SistemasAcademicos;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int codigo;
    private String local;
    private int cargaHoraria;
    private Professor professor;
    private ArrayList<Aluno> listaAlunos;

    public Disciplina(String nome, int codigo, String local, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.local = local;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.listaAlunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        listaAlunos.add(aluno);
        System.out.println("Aluno matriculado com sucesso na disciplina " + this.nome);
        exibirInformacoesDisciplina();
    }

    public boolean trancarAluno(Aluno aluno) {
        if (listaAlunos.remove(aluno)) {
            System.out.println("Aluno " + aluno.getNome() + " trancou a disciplina " + this.nome);
            return true;
        }
        return false;
    }

    public void exibirInformacoesDisciplina() {
        System.out.println("Nome da Disciplina: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("Local: " + this.local);
        System.out.println("Carga Horária: " + this.cargaHoraria + " horas");
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Alunos Matriculados: " + this.listaAlunos.size());
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public Professor getProfessor() {
        return professor;
    }

}
