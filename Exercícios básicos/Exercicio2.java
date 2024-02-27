import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {

        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = pergunta.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = pergunta.nextInt();
        pergunta.close();

        float soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " é " + soma);

    }
}
