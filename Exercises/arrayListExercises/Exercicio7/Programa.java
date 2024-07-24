package arrayListExercises.Exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        double[] vetor = new double[leitura.nextInt()];

        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitura.nextDouble();
            soma += vetor[i];
        }

        double media = soma/ vetor.length;

        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < vetor.length; i++) {
            if (media > vetor[i]) {
                System.out.println(vetor[i]);
            }
        }

        leitura.close();
    }
}
