package Exercicio2.Utilitario;

import Exercicio2.Entidade.Produto;
import Exercicio2.Entidade.ProdutoImportado;
import Exercicio2.Entidade.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Programa {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Entre com o número de produtos: ");
        int numeroProdutos = leitura.nextInt();
        for (int i = 1; i <= numeroProdutos; i++) {
            System.out.println("Produto #" + i + " data:");
            System.out.print("comum, usado ou importado (c/u/i)? ");
            char character = leitura.next().charAt(0);
            System.out.print("Nome: ");
            leitura.nextLine();
            String nome = leitura.nextLine();
            System.out.print("Preço: ");
            double preco = leitura.nextDouble();
            if (character == 'i'){
                System.out.print("Taxa aduaneira: ");
                double taxaAduaneira = leitura.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, taxaAduaneira));
            }
            else if (character == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                Date dataDeFabricacao = sdf.parse(leitura.next());
                produtos.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
            }
            else {
                produtos.add(new Produto(nome, preco));
            }
        }

        System.out.println();
        System.out.println("PREÇOS:");
        for (Produto prod: produtos) {
            System.out.println(prod.tagPreco());
        }

        leitura.close();
    }
}
