package Exercicio2.Entidade;

public class ProdutoImportado extends Produto{

    private Double taxaAduaneira;

    public ProdutoImportado(){
    }

    public ProdutoImportado(String nome, Double price, Double taxaAduaneira){
        super(nome, price);
        this.taxaAduaneira = taxaAduaneira;
    }

    public Double getTaxaAduaneira(){
        return taxaAduaneira;
    }

    public void setTaxaAduaneira(Double taxaAduaneira){
        this.taxaAduaneira = taxaAduaneira;
    }

    public Double precoTotal(){
        return getPreco() + taxaAduaneira;
    }

    @Override
    public String tagPreco() {
        return getNome()
                + " R$ "
                + String.format("%.2f", precoTotal())
                + " (taxa aduaneira: R$ "
                + String.format("%.2f", taxaAduaneira) + ")";
    }
}
