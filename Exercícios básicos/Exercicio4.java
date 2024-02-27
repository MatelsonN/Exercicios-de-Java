import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite na sequência os valores de A, B, C, D: ");
        int primeiro = pergunta.nextInt();
        int segundo = pergunta.nextInt();
        int terceiro = pergunta.nextInt();
        int quarto = pergunta.nextInt();

        pergunta.close();

        int diferenca = primeiro * segundo - terceiro * quarto;

        System.out.println("Diferença de A x B - C x D = " + diferenca);
    }
}
