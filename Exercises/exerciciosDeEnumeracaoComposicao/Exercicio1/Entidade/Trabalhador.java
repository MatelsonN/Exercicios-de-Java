package exerciciosDeEnumeracaoComposicao.Exercicio1.Entidade;

import exerciciosDeEnumeracaoComposicao.Exercicio1.Entidade.Enum.Cargo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private Cargo cargo;
    private double salarioBase;
    private Departamento departamento;
    private List<Contratos> contratos = new ArrayList<>();

    public Trabalhador(String nome, Cargo cargo, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contratos> getContratos() {
        return contratos;
    }

    public void adicionarContrato(Contratos contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(Contratos contrato) {
        contratos.remove(contrato);
    }

    public double rendimento (int mes, int ano) {
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
        for (Contratos con : contratos) {
            calendario.setTime(con.getData());
            int con_mes = 1 + calendario.get(Calendar.MONTH);
            int con_ano = calendario.get(Calendar.YEAR);
            if (con_mes == mes && con_ano == ano) {
                soma += con.valorTotal();
            }
        }
        return soma;
    }

}
