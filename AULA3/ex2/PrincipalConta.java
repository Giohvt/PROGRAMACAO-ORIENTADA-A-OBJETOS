package AULA3.ex2;

public class PrincipalConta {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(1001, "Giovanni");
        ContaCorrente conta2 = new ContaCorrente(1002, "Carlos");

  
        if (conta1.depositar(1000.00)) {
            System.out.println("Depósito realizado com sucesso.");
        }
        System.out.println("Saldo conta 1: R$ " + conta1.getSaldo());
        if (conta1.transferir(300.00, conta2)) {
            System.out.println("Transferência realizada com sucesso.");
        }
        System.out.println("Saldo conta 1: R$ " + conta1.getSaldo());
        System.out.println("Saldo conta 2: R$ " + conta2.getSaldo());
        if (conta2.sacar(100.00)) {
            System.out.println("Saque realizado com sucesso.");
        }
        System.out.println("Saldo final conta 2: R$ " + conta2.getSaldo());
        if (!conta2.sacar(500.00)) {
            System.out.println("Não foi possível realizar o saque.");
        }
    }
}