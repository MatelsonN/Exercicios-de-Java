package Exercicio1.Aplicacao;


import Exercicio1.Utilitarios.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        Retangulo valorRetangulo = new Retangulo();

        System.out.println("Entre com a altura e lagura do retangulo: ");
        valorRetangulo.altura = leitura.nextDouble();
        valorRetangulo.largura = leitura.nextDouble();

        System.out.printf("AREA = %.2f\n", valorRetangulo.area());
        System.out.printf("PERIMETRO = %.2f\n", valorRetangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f", valorRetangulo.diagonal());
        ///System.out.println(valorRetangulo);
        leitura.close();
    }
}
