package Exercicio3.Entidade;

public class PessoaFisica extends Imposto{

    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double impostoPagar() {
        if(getRendaAnual() >= 20000) {
            if (gastosSaude > 0) {
                return getRendaAnual() * 0.25 - gastosSaude * 0.50;
            }
            else {
                return getRendaAnual() * 0.25;
            }
        }
        else {
            if (gastosSaude > 0) {
                return getRendaAnual() * 0.15 - gastosSaude * 0.50;
            }
            else {
                return getRendaAnual() * 0.15;
            }
        }
    }
}
