import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite dois valores com uma casa decimal para (x e Y): ");
        double valorx = pergunta.nextDouble();
        double valory = pergunta.nextDouble();

        String ponto;
        if (valorx > 0 && valory > 0) {
            ponto = "Q1";
        } else if (valorx < 0 && valory > 0) {
            ponto = "Q2";
        } else if (valorx < 0 && valory <0) {
            ponto = "Q3";
        } else if (valorx > 0 && valory <0) {
            ponto = "Q4";
        } else {
            ponto = "Origem";
        }

        System.out.println(ponto);
        pergunta.close();
    }
}
