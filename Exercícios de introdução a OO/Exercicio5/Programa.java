package Exercicio5;

import Exercicio5.Utilitarios.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        Conta cliente;

        System.out.print("Digite o número da conta: ");
        int numeroDaConta = leitura.nextInt();
        System.out.print("Digite o nome do usuário da conta: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.print("Quer fazer um deposito inicial (s/n)? ");
        char pergunta = leitura.next().charAt(0);

        if (pergunta == 's') {
            System.out.print("Entre com o valor do deposito inicial: ");
            double depositoInicial = leitura.nextDouble();
            cliente = new Conta(numeroDaConta, nome, depositoInicial);
        }
        else {
            cliente = new Conta(numeroDaConta, nome);
        }

        System.out.println("Account data: ");
        System.out.print(cliente);

        System.out.print("\nEntre com o valor do deposito: ");
        cliente.depositoDaConta(leitura.nextDouble());
        System.out.println("Atualização da conta data: ");
        System.out.print(cliente);

        System.out.print("\nEntre com o valor da retirada: ");
        cliente.saqueDaConta(leitura.nextDouble());
        System.out.println("Atualização da conta data: ");
        System.out.print(cliente);

        leitura.close();
    }

}
