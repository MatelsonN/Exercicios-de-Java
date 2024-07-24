package exerciciosDeEnumeracaoComposicao.Exercicio3.Utilitario;

import exerciciosDeEnumeracaoComposicao.Exercicio3.Entidade.Cliente;
import exerciciosDeEnumeracaoComposicao.Exercicio3.Entidade.Enum.OrdemStatus;
import exerciciosDeEnumeracaoComposicao.Exercicio3.Entidade.Ordem;
import exerciciosDeEnumeracaoComposicao.Exercicio3.Entidade.OrdemItem;
import exerciciosDeEnumeracaoComposicao.Exercicio3.Entidade.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("Email: ");
        String email = leitura.next();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date dataNascimento = sdf.parse(leitura.next());

        Cliente clientes = new Cliente(nome, email, dataNascimento);

        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        OrdemStatus status = OrdemStatus.valueOf(leitura.next());

        Ordem pedidoCliente = new Ordem(new Date(),status, clientes);

        System.out.print("Quantos itens para este pedido? ");
        Integer quanItens = leitura.nextInt();
        for (int i = 1; i <= quanItens; i++) {
            System.out.println("Insira os dados do item " + i + "#:");
            System.out.print("Nome do produto: ");
            leitura.nextLine();
            String nomeProduto = leitura.nextLine();
            System.out.print("Preço do produto: ");
            Double precoProduto = leitura.nextDouble();

            Produto produtos = new Produto(nomeProduto, precoProduto);

            System.out.print("Quantidade do produto: ");
            Integer quantidade = leitura.nextInt();

            OrdemItem ordemPedido = new OrdemItem(quantidade, precoProduto, produtos);

            pedidoCliente.adicionarItem(ordemPedido);
        }

        System.out.println();
        System.out.println("Itens de pedido:" );
        System.out.println(pedidoCliente);

        leitura.close();

    }
}
