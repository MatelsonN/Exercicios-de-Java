package Exercises.basic;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {

        int result= 1;
        Scanner reading = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int value = reading.nextInt();

        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        System.out.println("Result = " + result);
        reading.close();
    }
}
