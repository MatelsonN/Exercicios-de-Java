import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double valor = pergunta.nextDouble();

        double imposto;
        if (valor <= 2000) {
           imposto = 0.0;
        } else if (valor <= 3000) {
           imposto = (valor - 2000) * 0.18;
        } else if (valor <= 4500) {
            imposto = (valor - 3000) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (valor - 4500) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.println("R$ " + imposto);
        }

        pergunta.close();
    }
}