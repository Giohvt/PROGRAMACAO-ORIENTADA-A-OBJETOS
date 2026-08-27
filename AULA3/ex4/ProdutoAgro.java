package AULA3.ex4;

public class ProdutoAgro {

    private long codigo;
    private String descricao;
    private double precoUnitario;
    private int quantidadeEstoque;

    public ProdutoAgro(long codigo, String descricao,
                       double precoUnitario, int quantidadeEstoque) {

        this.codigo = codigo;
        this.descricao = descricao;

        if (precoUnitario >= 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }

        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            this.quantidadeEstoque = 0;
        }
    }

    public ProdutoAgro(long codigo, String descricao,
                       double precoUnitario) {

        this(codigo, descricao, precoUnitario, 0);
    }

    public long getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void reajustarPreco(double percentual) {

        if (percentual < -100.0) {
            System.out.println("Reajuste inválido.");
            return;
        }

        precoUnitario = precoUnitario * (1 + percentual / 100);
    }

    public void adicionarEstoque(int quantidade) {

        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
        }
    }

    public boolean debitarEstoque(int quantidade) {

        if (quantidade <= 0) {
            return false;
        }
        if (quantidade > quantidadeEstoque) {
            return false;
        }
        quantidadeEstoque -= quantidade;
        return true;
    }
}
