package arrayListExercises.Exercicio3.Utilitarios;

import arrayListExercises.Exercicio3.Entidade.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar: ");
        Pessoa[] vetor = new Pessoa[leitura.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("nome: ");
            leitura.nextLine();
            String nome = leitura.nextLine();
            System.out.print("idade: ");
            int idade = leitura.nextInt();
            System.out.print("altura: ");
            double altura = leitura.nextDouble();
            vetor[i] = new Pessoa(nome, idade, altura);
        }

        double alturaSoma = 0.0;
        double valor = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                valor += 1.0;
            }
            alturaSoma += vetor[i].getAltura();

        }

        double alturaMedia = alturaSoma / vetor.length;
        double pessoaMenorIdade = (valor / vetor.length) * 100.0;

        System.out.printf("Altura média: %.2f", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", pessoaMenorIdade);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }

        leitura.close();
    }
}
