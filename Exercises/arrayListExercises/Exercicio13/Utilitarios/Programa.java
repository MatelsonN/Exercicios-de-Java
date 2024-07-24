package arrayListExercises.Exercicio13.Utilitarios;

import arrayListExercises.Exercicio13.Entidade.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        List<Funcionario> empregados = new ArrayList<>();

        System.out.print("Quantos funcionários deseja cadastrar? ");
        int numeroDeEmpregados = leitura.nextInt();

        for (int i = 1; i <= numeroDeEmpregados; i++){
            System.out.println("\nEmpregado #" + i + ":");
            System.out.print("Id: ");
            int id = leitura.nextInt();

            while(vascularId(empregados, id)) {
                System.out.print("Código Id já cadastrado. Tente novamente: ");
                id = leitura.nextInt();
            }

            System.out.print("Nome: ");
            leitura.nextLine();
            String nome = leitura.nextLine();
            System.out.print("Salário: ");
            double salario = leitura.nextDouble();

            empregados.add(new Funcionario(id, nome, salario));
        }

        System.out.print("\nDigite o id do funcionário: ");
        int id = leitura.nextInt();
        Funcionario empregadoId = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(empregadoId == null) {
            System.out.println("Id do funcionário não existe.");
        }
        else {
            System.out.print("Entre com o valor do aumento do salário em porcentagem: ");
            double aumento = leitura.nextDouble();
            empregadoId.aumentoSalario(aumento);
        }

        System.out.println("\nLista dos empregados:");

        for (Funcionario objeto : empregados) {
            System.out.println(objeto);
        }

        leitura.close();

    }

    private static boolean vascularId(List<Funcionario> empregados, int id) {
        Funcionario empregadoId = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return empregadoId != null;
    }
}