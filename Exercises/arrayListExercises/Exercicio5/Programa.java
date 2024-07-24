package arrayListExercises.Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        double[] vetor = new double[leitura.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitura.nextDouble();
        }

        double maiorValor = 0;
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f%n", maiorValor);
        System.out.print("POSIÇÃO DO MAIOR VALOR = " + posicao);

        leitura.close();

    }
}

