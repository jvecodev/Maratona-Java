package study.jvecodev.maratonajava.primeirospassos.SistemasAcademicos;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirInformacoesAluno() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
    }

    public void alterarDadosCadastrais(String novoNome, String novoCurso) {
        if (!novoNome.isEmpty()) {
            this.nome = novoNome;
        }
        if (!novoCurso.isEmpty()) {
            this.curso = novoCurso;
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
