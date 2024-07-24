package arrayListExercises.exercise2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        double soma = 0.0;

        System.out.print("Quantos númeors você vai digitar? ");
        double[] vetor = new double[leitura.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitura.nextDouble();
            soma += vetor[i];
        }
        System.out.print("VALORES = " );

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.println("\nSOMA = " + soma);
        System.out.println("MEDIA = " + soma/ vetor.length);

        leitura.close();
    }
}
