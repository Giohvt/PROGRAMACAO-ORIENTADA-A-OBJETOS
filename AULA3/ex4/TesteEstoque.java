package AULA3.ex4;

public class TesteEstoque {

    public static void main(String[] args) {

        ProdutoAgro produto1 = new ProdutoAgro(
                1001,
                "Adubo Orgânico",
                50.00,
                20
        );

        ProdutoAgro produto2 = new ProdutoAgro(
                1002,
                "Semente de Milho",
                25.00
        );

        System.out.println("Produto 1: " + produto1.getDescricao());
        System.out.println("Preço: R$ " + produto1.getPrecoUnitario());
        System.out.println("Estoque: " + produto1.getQuantidadeEstoque());

        System.out.println();

        System.out.println("Produto 2: " + produto2.getDescricao());
        System.out.println("Preço: R$ " + produto2.getPrecoUnitario());
        System.out.println("Estoque: " + produto2.getQuantidadeEstoque());

        produto2.adicionarEstoque(50);

        System.out.println();
        System.out.println("Estoque produto 2 após entrada: "
                + produto2.getQuantidadeEstoque());

        if (produto2.debitarEstoque(10)) {
            System.out.println("Saída de estoque realizada.");
        } else {
            System.out.println("Não foi possível realizar a saída.");
        }
        System.out.println("Estoque atual: "
                + produto2.getQuantidadeEstoque());

        produto1.reajustarPreco(10.0);
        System.out.println();
        System.out.println("Novo preço do produto 1: R$ "
                + produto1.getPrecoUnitario());
    }
}
