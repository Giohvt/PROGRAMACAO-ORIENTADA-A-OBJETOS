package AULA3.ex3;

public class LoteSementes {

    private String codigoLote;
    private String cultura;
    private double quilosDisponiveis;
    private double taxaGerminacaoPercentual;
    private String statusCertificacao;


    public LoteSementes(String codigoLote, String cultura, double quilosDisponiveis) {
        this.codigoLote = codigoLote;
        this.cultura = cultura;
        this.quilosDisponiveis = quilosDisponiveis;
        this.taxaGerminacaoPercentual = 0.0;
        this.statusCertificacao = "EM_ANALISE";
    }
    public String getCodigoLote() {
        return codigoLote;
    }
    public String getCultura() {
        return cultura;
    }
    public double getQuilosDisponiveis() {
        return quilosDisponiveis;
    }
    public double getTaxaGerminacaoPercentual() {
        return taxaGerminacaoPercentual;
    }
    public String getStatusCertificacao() {
        return statusCertificacao;
    }
    public void registrarLaudoGerminacao(double taxa) {
        if (!statusCertificacao.equals("EM_ANALISE")) {
            System.out.println("Laudo recusado: o lote já foi analisado.");
            return;
        }
        if (taxa < 0.0 || taxa > 100.0) {
            System.out.println("Taxa de germinação inválida.");
            return;
        }
        taxaGerminacaoPercentual = taxa;
        if (taxa >= 85.0) {
            statusCertificacao = "APROVADO";
            System.out.println("Lote aprovado.");
        } else {
            statusCertificacao = "REJEITADO";
            System.out.println("Lote rejeitado.");
        }
    }
    public boolean fracionarParaPlantio(double quilosRequisitados) {

        if (!statusCertificacao.equals("APROVADO")) {
            System.out.println("Operação recusada: lote não está aprovado.");
            return false;
        }
        if (quilosRequisitados <= 0) {
            System.out.println("Operação recusada: quantidade inválida.");
            return false;
        }
        if (quilosRequisitados > quilosDisponiveis) {
            System.out.println("Operação recusada: quantidade insuficiente.");
            return false;
        }
        quilosDisponiveis -= quilosRequisitados;
        return true;
    }
}
