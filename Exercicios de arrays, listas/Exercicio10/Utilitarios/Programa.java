package Exercicio10.Utilitarios;

import Exercicio10.Entidade.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        System.out.print("Quantos alunos serão cadastrados? ");
        Aluno[] vetor = new Aluno[leitura.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            leitura.nextLine();
            String nome = leitura.nextLine();
            double primeraNota = leitura.nextDouble();
            double segundaNota = leitura.nextDouble();
            vetor[i] = new Aluno(nome, primeraNota, segundaNota);
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < vetor.length; i ++) {

            if ((vetor[i].getPrimeiraNota() + vetor[i].getSegundaNota()) / 2 >= 6) {
                System.out.println(vetor[i].getNome());
            }
        }

        leitura.close();
    }
}
