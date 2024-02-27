import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite o tamanho da área: ");
        double tamanho = pergunta.nextDouble();
        pergunta.close();

        double pi = 3.14159;
        double area = pi * Math.pow(tamanho, 2);
        System.out.printf("A = %.4f", area);

    }
}
