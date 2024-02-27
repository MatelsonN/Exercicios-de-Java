package Exercicio12.Utilitarios;

import Exercicio12.Entidade.Hotel;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        Hotel[] vetor = new Hotel[10];

        System.out.print("Quantos quartos serão alugados? ");
        int aluguel = leitura.nextInt();

        for (int i = 0; i < aluguel; i++) {
            System.out.println("Quarto #" + (i+1) + ":");
            System.out.print("Nome: ");
            leitura.nextLine();
            String nome = leitura.nextLine();
            System.out.print("Email: ");
            String email = leitura.next();
            System.out.print("Quarto: ");
            int quarto = leitura.nextInt();

            if (vetor[i] != null) {
                System.out.println("Quarto ocupado!");

            } else {
                System.out.println("Reserva(s) concluida(s) com sucesso!");
                int numero = quarto;
                vetor[numero] = new Hotel(nome, email, quarto);
            }
        }

        System.out.println("Quartos ocupados:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println(vetor[i].getQuarto() + ": " + vetor[i].getNome() + ", " + vetor[i].getEmail());
            }
        }

        leitura.close();
    }
}
