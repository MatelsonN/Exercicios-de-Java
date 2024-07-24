package basicExercises;

import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int valor = leitura.nextInt();

        for (int i = 1; i <= valor; i++) {

            if (valor % i ==0) {
                System.out.println(i);
            }
        }
        leitura.close();
    }
}

