package Exercicio3.Entidade;

public class PessoaJuridica extends Imposto {


    private Integer funcionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }
    @Override
    public Double impostoPagar() {
        if (funcionarios > 10) {
            return getRendaAnual() * 0.14;
        }
        else {
            return getRendaAnual() * 0.16;
        }
    }


}
