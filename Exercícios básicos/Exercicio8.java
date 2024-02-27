import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = pergunta.nextInt();
        pergunta.close();

        if (numero >= 0) {
            System.out.println("NÃO NEGATIVO!");
        } else {
            System.out.println("NEGATIVO!");
        }

    }
}
