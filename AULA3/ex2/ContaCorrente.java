package AULA3.ex2;

public class ContaCorrente {

    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaCorrente(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            return true;
        }

        return false;
    }
    public boolean sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Saque recusado: o valor deve ser positivo.");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Saque recusado: saldo insuficiente.");
            return false;
        }

        saldo -= valor;
        return true;
    }
    public boolean transferir(double valor, ContaCorrente contaDestino) {
        if (contaDestino == null) {
            System.out.println("Transferência recusada: conta de destino inválida.");
            return false;
        }
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}