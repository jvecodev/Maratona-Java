package study.jvecodev.maratonajava.primeirospassos.Banco;

public class Cliente {
    private String nome;
    private String email;
    private String senha;
    private int idade;
    private String cpf ;

    public Cliente (String nome, String email, String senha, int idade, String cpf ){

        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this. idade = idade;
        this. cpf = cpf ;


    }
    public String getnome (){
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getIdade(){
        return idade;
    }

    public String getcpf (){
        return cpf;
    }

    //Sets

    public void setnome(String nome) {

        this.nome = nome.toUpperCase();
    }

    public void setemail(String email) {

        this.email = email;
    }

    public void setsenha(String senha) {

        this.senha = senha;
    }

    public void setidade(int idade) {

        this.idade = idade;

    }



        public void setCpf(String cpf) {

            this.cpf = cpf;
        }


}
