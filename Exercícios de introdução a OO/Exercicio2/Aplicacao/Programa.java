package Exercicio2.Aplicacao;

import Exercicio2.Utilitarios.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){

        Empregado empregado = new Empregado();
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.print("Nome: ");
        empregado.nome = leitura.nextLine();
        System.out.print("Salário bruto: ");
        empregado.salario = leitura.nextDouble();
        System.out.print("Taxa: ");
        empregado.taxa = leitura.nextDouble();

        System.out.println("Empregado: " + empregado);
        System.out.print("Quantos porcentos de incremento no salário? ");
        double porcentagem = leitura.nextDouble();
        empregado.aumentoDeSalario(porcentagem);

        System.out.println("Atualização: " + empregado);
    }

}
