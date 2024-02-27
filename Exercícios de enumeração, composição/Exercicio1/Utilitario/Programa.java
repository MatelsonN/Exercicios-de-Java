package Exercicio1.Utilitario;

import Exercicio1.Entidade.Trabalhador;
import Exercicio1.Entidade.Contratos;
import Exercicio1.Entidade.Departamento;
import Exercicio1.Entidade.Enum.Cargo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departamento = leitura.nextLine();
        System.out.println("Inserir dados do trabalhador:");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("Qual o nível do cargo: ");
        String cargo = leitura.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = leitura.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nome, Cargo.valueOf(cargo), salarioBase, new Departamento(departamento));

        System.out.print("Quantos contratos o trabalhador teve: ");
        int totalContrato = leitura.nextInt();

        for (int i = 1; i <= totalContrato; i++) {
            System.out.println("Entre com o contrato número " + i + ":");
            System.out.print("Data (DD/MM/YYYY)): ");
            Date data = dataFormatada.parse(leitura.next());
            System.out.print("Valor da hora trabalhada: ");
            double valorPorHora = leitura.nextDouble();
            System.out.print("Total de horas trabalhadas: ");
            int horas = leitura.nextInt();
            Contratos contrato = new Contratos(data, valorPorHora, horas);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.print("Entre com o mês e ano para calcular o rendimento (MM/YYYYY): ");
        String mesEAno = leitura.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Faturamento de " + mesEAno + ": " + String.format("%.2f", trabalhador.rendimento(mes, ano)));
        leitura.close();
    }
}
