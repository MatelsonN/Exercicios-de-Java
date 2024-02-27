import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);
        System.out.println("""
                CODIGO      ESPECIFICAÇÃO       PREÇO
                  1         Cachorro Quente    R$ 4.00
                  2         X-Salada           R$ 4.50
                  3         X-Bacon            R$ 5.00
                  4         Torrada simples    R$ 2.00
                  5         Refrigerante       R$ 1.50
                  
                Conforme a tabela, escolha o código e a quantidade do item: """);
        int codigo = pergunta.nextInt();
        int quantidade = pergunta.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }

        System.out.printf("TOTAL: R$ %.2f", total);
        pergunta.close();
    }
}
