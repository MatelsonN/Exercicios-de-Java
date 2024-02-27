import java.util.Scanner;
import java.util.Locale;

public class Exercicio21 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int inteiro = leitura.nextInt();

        for (int i = 0; i < inteiro; i++) {
            System.out.println("Digite três valores para encontrar a média ponderada: ");
            double valor1 = leitura.nextDouble();
            double valor2 = leitura.nextDouble();
            double valor3 = leitura.nextDouble();

            double resultado = (valor1 * 2 + valor2 * 3 + valor3 * 5)/(2 + 3 + 5);
            System.out.printf("%.1f\n", resultado);
        }
        leitura.close();
    }
}
