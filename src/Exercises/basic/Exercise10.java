package Exercises.basic;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("Enter two numbers, A e B: ");
        int number1 = reading.nextInt();
        int number2 = reading.nextInt();
        reading.close();

        if (number1 % number2 == 0 || number2 % number1 == 0) {
            System.out.println("THERE ARE MULTIPLE!");
        } else {
            System.out.println("THEY ARE NOT MULTIPLE!");
        }

    }
}
