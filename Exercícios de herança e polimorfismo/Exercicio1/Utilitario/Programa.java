package Exercicio1.Utilitario;

import Exercicio1.Entidade.Empregado;
import Exercicio1.Entidade.EmpregadoTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();

        System.out.print("Entre com o número de emrpegados: ");
        int num = leitura.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("Terceirizado (s/n)? ");
            char cr = leitura.next().charAt(0);
            System.out.print("Nome: ");
            leitura.nextLine();
            String nome = leitura.nextLine();
            System.out.print("Horas: ");
            double horas = leitura.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = leitura.nextDouble();
            if (cr == 's') {
                System.out.print("Custo adicional: ");
                double custoAdicional = leitura.nextDouble();
                empregados.add(new EmpregadoTerceirizado(nome, horas, valorPorHora, custoAdicional));
            } else {
                empregados.add(new Empregado(nome, horas, valorPorHora));
            }
        }

        System.out.println();
        System.out.println("Pagamentos:");
        for (Empregado emp : empregados) {
            System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));

        }

        leitura.close();
    }
}
