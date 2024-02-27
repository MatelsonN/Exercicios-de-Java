package Exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int[] vetor = new int[leitura.nextInt()];

        int soma = 0;
        int somaLenght = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitura.nextInt();
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                somaLenght += 1;
            }
        }

        if (soma > 0) {
            double media = soma/ somaLenght;
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }
        else {
            System.out.println("NENHUM NUMERO PAR");
        }

        leitura.close();
    }
}
