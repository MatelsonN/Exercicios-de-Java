import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = pergunta.nextInt();
        pergunta.close();

        if (numero % 2 == 0) {
            System.out.println("PAR!");
        } else {
            System.out.println("IMPAR!!");
        }

    }
}
