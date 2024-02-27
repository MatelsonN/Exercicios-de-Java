package Exercicio9.Utilitarios;

import Exercicio9.Entidade.Pessoa;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("quantas pessoas você vai digitar? ");
        Pessoa[] vetor = new Pessoa[leitura.nextInt()];

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = leitura.next();
            System.out.print("Idade: ");
            int idade = leitura.nextInt();
            vetor[i] = new Pessoa(nome, idade);
        }

        String pessoaVelha = "";
        int pessoaIdade = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].getIdade() > pessoaIdade) {
                pessoaIdade = vetor[i].getIdade();
                pessoaVelha = vetor[i].getNome();
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + pessoaVelha);

        leitura.close();
    }
}
