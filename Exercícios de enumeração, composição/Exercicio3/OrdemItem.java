package Exercicio3;

public class OrdemItem {

    private Integer quantidade;
    private Produto preco;

    public OrdemItem(Integer quantidade, Produto preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getPreco() {
        return preco;
    }

    public void setPreco(Produto preco) {
        this.preco = preco;
    }

    public Double subTotal(Integer quantidade, Produto preco) {
        return preco = quantidade * preco;
    }
}
