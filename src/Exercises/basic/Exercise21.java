package Exercises.basic;

import java.util.Scanner;
import java.util.Locale;

public class Exercise21 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = reading.nextInt();

        for (int i = 0; i < integer; i++) {
            System.out.print("Enter three values to find the weighted average: ");
            double value1 = reading.nextDouble();
            double value2 = reading.nextDouble();
            double value3 = reading.nextDouble();

            double result = (value1 * 2 + value2 * 3 + value3 * 5)/(2 + 3 + 5);
            System.out.printf("%.1f\n", result);
        }
        reading.close();
    }
}
