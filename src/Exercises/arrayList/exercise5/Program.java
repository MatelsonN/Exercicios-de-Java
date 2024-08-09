package arrayListExercises.exercise5;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        double[] vector = new double[reading.nextInt()];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = reading.nextDouble();
        }

        double highestValue = 0;
        int position = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > highestValue) {
                highestValue = vector[i];
                position = i;
            }
        }

        System.out.printf("\nGREATEST VALUE = %.1f%n", highestValue);
        System.out.print("POSITION OF THE HIGHEST VALUE = " + position);

        reading.close();

    }
}

