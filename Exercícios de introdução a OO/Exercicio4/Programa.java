package Exercicio4;

import Exercicio4.Utilitarios.Real;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.print("Qual o preço do dollar: ");
        Real.dolar = leitura.nextDouble();
        System.out.print("Qual o total de dollar para conversão: ");
        Real.valorDolar = leitura.nextDouble();

        System.out.printf("Valor pago em reais: %.2f", Real.conversorDolar());
        leitura.close();
    }

}
