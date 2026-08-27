package AULA2;

public class Carro {

    String modelo;
    String cor;
    String placa;
    int numeroDePortas;


    boolean motorLigado = false;
    boolean farolLigado = false;

    void ligarMotor() {
        motorLigado = true;
        System.out.println("O motor foi ligado.");
    }
    void desligarMotor() {
        motorLigado = false;
        System.out.println("O motor foi desligado.");
    }
    void ligarFarol() {
        farolLigado = true;
        System.out.println("O farol foi ligado.");
    }
    void desligarFarol() {
        farolLigado = false;
        System.out.println("O farol foi desligado.");
    }
    void virarDireita() {
        System.out.println("O carro virou à direita.");
    }
    void virarEsquerda() {
        System.out.println("O carro virou à esquerda.");
    }
    public static void main(String[] args) {
        Carro carro = new Carro();    
        carro.modelo = "Toyota Corolla";
        carro.cor = "Preto";
        carro.placa = "ABC-1234";
        carro.numeroDePortas = 4;

        carro.ligarMotor();
        carro.ligarFarol();
        carro.virarDireita();
        carro.virarEsquerda();
        carro.desligarFarol();
        carro.desligarMotor();
    }
}