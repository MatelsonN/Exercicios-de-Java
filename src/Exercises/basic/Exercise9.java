package Exercises.basic;

import java.util.Locale;
import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = reading.nextInt();
        reading.close();

        if (number % 2 == 0) {
            System.out.println("PAIR!");
        } else {
            System.out.println("ODD!!");
        }

    }
}
