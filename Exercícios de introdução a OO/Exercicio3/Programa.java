package Exercicio3;

import Exercicio3.Utilitarios.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do aluno e depois as três notas dele: ");
        estudante.nome = leitura.nextLine();
        estudante.primeiraNota = leitura.nextDouble();
        estudante.segundaNota = leitura.nextDouble();
        estudante.terceiraNota = leitura.nextDouble();

        System.out.println(estudante);
        leitura.close();
    }
}
