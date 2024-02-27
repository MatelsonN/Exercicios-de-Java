package Exercicio3.Utilitarios;

public class Estudante {

    public String nome;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;

    public double media() {

        return primeiraNota + segundaNota + terceiraNota;
    }

    public String toString() {

        if (media() >= 60) {
            return "GRADE FINAL = "
                    + media()
                    +"\nPASSOU";
        }
        else {
            return "GRADE FINAL = "
                    + String.format("%.2f",media())
                    +"\nNÃO PASSOU"
                    +"\nFALTAM " + (String.format("%.2f", 60 - media())) + " PONTOS.";
        }
    }

}
