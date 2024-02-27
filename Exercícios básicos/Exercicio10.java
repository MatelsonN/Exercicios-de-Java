import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite dois números, A e B: ");
        int numero1 = pergunta.nextInt();
        int numero2 = pergunta.nextInt();
        pergunta.close();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("SÃO MULTIPLOS!");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS!");
        }

    }
}
