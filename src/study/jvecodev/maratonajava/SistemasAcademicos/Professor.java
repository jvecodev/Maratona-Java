package study.jvecodev.maratonajava.SistemasAcademicos;

public class Professor {
    private String nome;
    private String email;
    private int idade;
    private String codigoRH;
    private String titulacao;

    public Professor(String nome, String email, int idade, String codigoRH, String titulacao) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.codigoRH = codigoRH;
        this.titulacao = titulacao;
    }

    // Método para exibir informações do professor
    public void exibirInformacoesProfessor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Idade: " + this.idade);
        System.out.println("Código RH: " + this.codigoRH);
        System.out.println("Titulação: " + this.titulacao);
    }

    // Método para alterar dados cadastrais do professor
    public void alterarDadosCadastrais(String novoNome, String novoEmail, int novaIdade, String novaTitulacao) {
        if (!novoNome.isEmpty()) {
            this.nome = novoNome;
        }
        if (!novoEmail.isEmpty()) {
            this.email = novoEmail;
        }
        if (novaIdade > 0) {
            this.idade = novaIdade;
        }
        if (!novaTitulacao.isEmpty()) {
            this.titulacao = novaTitulacao;
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCodigoRH() {
        return codigoRH;
    }

    public void setCodigoRH(String codigoRH) {
        this.codigoRH = codigoRH;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
