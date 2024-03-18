package Exercicio1.utilitario;

import Exercicio1.entidade.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta");
            System.out.print("Número: ");
            int numero = leitura.nextInt();
            System.out.print("Titular: ");
            leitura.nextLine();
            String titular = leitura.nextLine();
            System.out.print("Balanço inicial: ");
            double balanco = leitura.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteSaque = leitura.nextDouble();

            Conta conta = new Conta(numero, titular, balanco, limiteSaque);

            System.out.println();
            System.out.print("Entre com o valor que deseja sacar: ");
            conta.saque(leitura.nextDouble());

            System.out.println("Novo balanco: " + conta.getBalanco());
        }
        catch (RuntimeException e) {
            System.out.println("Erro de retirada: " + e.getMessage());
        }
    }
}
