package Exercicio3.Utilitario;

import Exercicio1.Entidade.Enum.Cargo;
import Exercicio3.Entidade.Cliente;
import Exercicio3.Entidade.Enum.OrdemStatus;
import Exercicio3.Entidade.Ordem;
import Exercicio3.Entidade.OrdemItem;
import Exercicio3.Entidade.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("Email: ");
        String email = leitura.next();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date dataNascimento = sdf.parse(leitura.next());

        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        String status = leitura.next();

        Ordem pedidoCliente = new Ordem(new Date(),
                OrdemStatus.valueOf(status),
                new Cliente(nome, email, dataNascimento));

        System.out.print("Quantos itens para este pedido? ");
        Integer quanItens = leitura.nextInt();
        for (int i = 1; i <= quanItens; i++) {
            System.out.println("Insira os dados do item " + i + "#:");
            System.out.print("Nome do produto: ");
            String nomeProduto = leitura.next();
            System.out.print("Preço do produto: ");
            Double precoProduto = leitura.nextDouble();
            System.out.print("Quantidade do produto: ");
            Integer quantidade = leitura.nextInt();
            OrdemItem ordemPedido = new OrdemItem(quantidade, precoProduto, new Produto(nomeProduto, precoProduto));
            pedidoCliente.adicionarItem(ordemPedido);
        }

        System.out.println("RESUMO DO PEDIDO:");
        System.out.println(pedidoCliente);







        leitura.close();

    }
}
