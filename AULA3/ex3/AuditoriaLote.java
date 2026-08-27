package AULA3.ex3;

public class AuditoriaLote {

    public static void main(String[] args) {

        LoteSementes lote = new LoteSementes(
                "LOTE-001",
                "Feijão Preto Crioulo",
                100.0
        );

        System.out.println("Status inicial: " + lote.getStatusCertificacao());

        if (!lote.fracionarParaPlantio(20.0)) {
            System.out.println("Fracionamento não permitido antes da análise.");
        }

        lote.registrarLaudoGerminacao(70.0);

        System.out.println("Status: " + lote.getStatusCertificacao());

        // Tentativa após rejeição
        if (!lote.fracionarParaPlantio(20.0)) {
            System.out.println("Fracionamento não permitido: lote rejeitado.");
        }

     
        LoteSementes loteAprovado = new LoteSementes(
                "LOTE-002",
                "Feijão Preto Crioulo",
                100.0
        );
        loteAprovado.registrarLaudoGerminacao(90.0);

        System.out.println("Status: " + loteAprovado.getStatusCertificacao());

        if (loteAprovado.fracionarParaPlantio(30.0)) {
            System.out.println("Fracionamento realizado com sucesso.");
            System.out.println(
                    "Quilos restantes: " +
                    loteAprovado.getQuilosDisponiveis()
            );
        }
    }
}
