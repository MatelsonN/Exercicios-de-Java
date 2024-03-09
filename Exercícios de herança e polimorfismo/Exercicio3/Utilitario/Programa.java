package Exercicio3.Utilitario;

import Exercicio3.Entidade.Imposto;
import Exercicio3.Entidade.PessoaFisica;
import Exercicio3.Entidade.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        List<Imposto> impostos = new ArrayList<>();

        System.out.print("Digite o número de contribuintes: ");
        int contribuinte = leitura.nextInt();
        for (int i = 1; i <= contribuinte; i++){
            System.out.println("Dados do contribuinte #" + i + ": ");
            System.out.print("Pessoa física ou jurídica (f/j)? ");
            char caracter = leitura.next().charAt(0);
            System.out.print("Nome: ");
            leitura.nextLine();
            String nome = leitura.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = leitura.nextDouble();
            if(caracter == 'f'){
                System.out.print("Gastos em saúde: ");
                double gastosSaude = leitura.nextDouble();
                impostos.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }
            else {
                System.out.print("Número de funcionários: ");
                int funcionario = leitura.nextInt();
                impostos.add(new PessoaJuridica(nome, rendaAnual, funcionario));
            }
        }

        System.out.println();
        double soma = 0.0;
        System.out.println("IMPOSTOS PAGOS:");
        for (Imposto taxas: impostos){
            System.out.println(taxas.getNome() + ": R$ " + String.format("%.2f", taxas.impostoPagar()));
            soma += taxas.impostoPagar();
        }
        System.out.println();
        System.out.println("Total da taxas: R$ " + soma);

        leitura.close();
    }
}
