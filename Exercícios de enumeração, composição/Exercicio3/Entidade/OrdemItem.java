package Exercicio3.Entidade;

public class OrdemItem {

    private Integer quantidade;
    private Double preco;
    private Produto precoItem;

    public OrdemItem(Integer quantidade, Double preco, Produto precoItem) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoItem = precoItem;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public Produto getPrecoItem() {
        return precoItem;
    }

    public Double subTotal(Integer quantidade, Produto precoItem) {
        return preco = quantidade * precoItem.getPreco();
    }
}
