package arrayListExercises.Exercicio11.Utilitarios;

import arrayListExercises.Exercicio11.Entidade.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastradar? ");
        Pessoa[] vetor = new Pessoa[leitura.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            double altura = leitura.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            char genero = leitura.next().charAt(0);
            vetor[i] = new Pessoa(altura, genero);

        }

        double maiorAltura = vetor[0].getAltura();
        double menorAltura = vetor[0].getAltura();

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i].getAltura() > maiorAltura) {
                maiorAltura = vetor[i].getAltura();
            }
            if (vetor[i].getAltura() < menorAltura) {
                menorAltura = vetor[i].getAltura();
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        double soma = 0.0;
        int mulheres = 0;
        int homens = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getGenero() == 'F') {
                soma += vetor[i].getAltura();
                mulheres += 1;
            }
            else {
                homens += 1;
            }
        }

        System.out.printf("Media das alturas das mulheres = %.2f%n", (soma/mulheres));
        System.out.printf("Numero de homens = " + homens);
        leitura.close();

    }
}
