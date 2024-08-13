package Exercises.basic;

import java.util.Scanner;

public class Exercise2 {
    public static void main (String[] args) {

        Scanner reading = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = reading.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = reading.nextInt();
        reading.close();

        float soma = number1 + number2;

        System.out.println("The sum of " + number1 + " + " + number2 + " it is " + soma);

    }
}
