import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Escolha um valor qualquer: ");
        double valor = pergunta.nextDouble();

        String intervalo;
        if (valor > 0 && valor <= 25) {
            intervalo = "Intervalo [0,25]";
        } else if (valor > 25 && valor <= 50) {
            intervalo = "Intervalo [25,50]";
        } else if (valor > 50 && valor <= 75) {
            intervalo = "Intervalo [50,75]";
        } else if (valor > 75 && valor <= 100) {
            intervalo = "Intervalo [75,100]";
        } else {
            intervalo = "Fora do intervalo";
        }

        System.out.printf(intervalo);
        pergunta.close();
    }
}
