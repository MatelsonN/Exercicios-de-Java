package Exercicio1.Entidade;

public class Empregado {

    private String nome;
    private Double horas;
    private Double valorPorHora;

    public Empregado() {
    }

    public Empregado(String nome, Double horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double pagamento() {
        return horas * valorPorHora;
    }
}
