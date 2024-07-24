package basicExercises;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {

        int resultado= 1;
        Scanner leitura = new Scanner(System.in);
        int valor = leitura.nextInt();

        for (int i = 1; i <= valor; i++) {
            resultado *= i;
        }
        System.out.println(resultado);
        leitura.close();
    }
}
