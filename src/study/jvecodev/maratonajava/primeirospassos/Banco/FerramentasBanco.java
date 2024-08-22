package study.jvecodev.maratonajava.primeirospassos.Banco;

public class FerramentasBanco {
    private double saldo;

    public FerramentasBanco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para verificar o saldo
    public double verificarSaldo() {
        return saldo;
    }

    // Método para sacar dinheiro
    public void sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque de R$" + quantia + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido. Recomendamos que deposite");
        }
    }

    // Método para depositar dinheiro
    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Depósito de R$" + quantia + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para pagar uma conta
    public void pagarConta(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para alterar informações pessoais (pode ser expandido conforme necessário)
    public void alterarInfoPessoal(Cliente cliente, String novoNome, String novoEmail, String novaSenha, int novaIdade) {
        cliente.setnome(novoNome);
        cliente.setemail(novoEmail);
        cliente.setsenha(novaSenha);
        cliente.setidade(novaIdade);
        System.out.println("Informações pessoais alteradas com sucesso.");
    }
}

