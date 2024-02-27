package Exercicio6;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int[] vetor = new int[leitura.nextInt()];
        int[] vetorA = new int[vetor.length];
        int[] vetorB = new int[vetor.length];

        System.out.println("Digite os valores do vetor A:");

        for (int i = 0; i < vetor.length; i++) {
            vetorA[i] = leitura.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");

        for (int i = 0; i < vetor.length; i++) {
            vetorB[i] = leitura.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetorA[i] + vetorB[i]);
        }

        leitura.close();
    }
}
