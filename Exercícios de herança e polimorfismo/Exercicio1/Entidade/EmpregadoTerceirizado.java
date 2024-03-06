package Exercicio1.Entidade;

public class EmpregadoTerceirizado extends Empregado{

    private Double taxaAdicional;

    public EmpregadoTerceirizado() {
        super();
    }

    public EmpregadoTerceirizado(String nome, Double horas, Double valorPorHora, Double taxaAdicional) {
        super(nome, horas, valorPorHora);
        this.taxaAdicional = taxaAdicional;
    }

    public Double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(Double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + taxaAdicional * 1.1;
    }
}
