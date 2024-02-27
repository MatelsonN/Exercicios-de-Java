package Exercicio14;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o número de linhas e colunas da matriz: ");
        int linha = leitura.nextInt();
        int coluna = leitura.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leitura.nextInt();
            }
        }

        System.out.print("Digite um número para pesquisar na matriz: ");
        int numero = leitura.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if (numero == matriz[i][j]) {
                    System.out.print("\nPosição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.print("\nEsquerda: " + matriz[i][(j-1)]);
                    }
                    if (j < matriz.length - 1) {
                        System.out.print("\nDireita: " + matriz[i][(j+1)]);
                    }
                    if (i > 0) {
                        System.out.print("\nEmcima: " + matriz[(i-1)][(j)]);
                    }
                    if (i < matriz.length - 1 ) {
                        System.out.print("\nEmbaixo: " + matriz[(i+1)][(j)]);
                    }
                }
            }
        }

        leitura.close();
    }
}
