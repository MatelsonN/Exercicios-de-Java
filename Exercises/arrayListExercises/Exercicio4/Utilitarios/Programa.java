package arrayListExercises.Exercicio4.Utilitarios;

import arrayListExercises.Exercicio4.Entidade.NumeroPar;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        NumeroPar[] vetor = new NumeroPar[leitura.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            int par = leitura.nextInt();
            vetor[i] = new NumeroPar(par);
        }

        int quantidadePar = 0;

        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].getPar() % 2 == 0) {
                System.out.print(vetor[i].getPar() + " ");
                quantidadePar += 1;
            }
        }

        System.out.print("\nQUANTIDADE DE PARES = " + quantidadePar);

        leitura.close();
    }
}
