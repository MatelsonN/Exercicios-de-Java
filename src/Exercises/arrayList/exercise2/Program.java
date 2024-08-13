package Exercises.arrayList.exercise2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        double sum = 0.0;

        System.out.print("How many numbers will you enter? ");
        double[] vector = new double[reading.nextInt()];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = reading.nextDouble();
            sum += vector[i];
        }
        System.out.print("VALUES = " );

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%.1f ", vector[i]);
        }

        System.out.println("\nSUM = " + sum);
        System.out.println("AVERAGE = " + sum/ vector.length);

        reading.close();
    }
}
