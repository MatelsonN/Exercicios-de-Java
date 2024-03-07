package Exercicio2.Entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataDeFabricacao;

    public ProdutoUsado(){
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao){
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricação(){
        return dataDeFabricacao;
    }

    public void setDataDeFabricação(Date dataDeFabricação){
        this.dataDeFabricacao = dataDeFabricação;
    }

    @Override
    public String tagPreco() {
        return getNome() + " (usado)"
                + " R$ "
                + String.format("%.2f", getPreco())
                + " (Data de fabricação: "
                + sdf.format(dataDeFabricacao) + ")";
    }

    public String toString(){
        return tagPreco();
    }
}
