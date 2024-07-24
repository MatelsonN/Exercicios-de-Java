package basicExercises;

import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int valor = leitura.nextInt();

        for (int i = 1; i <= valor; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d\n", primeiro, segundo, terceiro);
        }
        leitura.close();
    }
}

