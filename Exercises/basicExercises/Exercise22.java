package basicExercises;

import java.util.Scanner;
import java.util.Locale;

public class Exercise22 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int inteiro = leitura.nextInt();

        for (int i = 0; i < inteiro; i++) {
            System.out.print("Digite dois valores: ");
            double valor1 = leitura.nextDouble();
            double valor2 = leitura.nextDouble();

            if (valor2 != 0) {
                double resultado = valor1 / valor2;
                System.out.printf("%.1f\n", resultado);
            } else {
                System.out.println("Divisão impossível.");
            }
        }
        leitura.close();
    }
}
