package Exercises.basic;

import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int valor = reading.nextInt();

        for (int i = 1; i <= valor; i++) {
            int first = i;
            int second = i * i;
            int third = i * i * i;
            System.out.printf("%d %d %d\n", first, second, third);
        }
        reading.close();
    }
}

