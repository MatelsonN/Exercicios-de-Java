package Exercicio5.Utilitarios;

public class Conta {

    private int numeroDaConta;
    private String nome;
    private double valorDaConta;

    public Conta(int numeroDaConta, String nome, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        depositoDaConta(depositoInicial);
    }

    public Conta(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
    }


    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorDaConta() {
        return valorDaConta;
    }

    public void depositoDaConta(double balanco) {
        valorDaConta += balanco;
    }

    public void saqueDaConta(double balanco) {
        valorDaConta -= balanco + 5.00;
    }

    public String toString() {
        return "Conta "
                + numeroDaConta
                + ", Nome: "
                + nome
                + ", Balanço: "
                + String.format("%.2f", valorDaConta);
    }
}
