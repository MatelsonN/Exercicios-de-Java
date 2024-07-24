package arrayListExercises.exercise1;
;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int[] vetor = new int[leitura.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitura.nextInt();
            }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        leitura.close();
    }
}
