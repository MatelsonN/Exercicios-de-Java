package arrayListExercises.exercise7;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        double[] vector = new double[reading.nextInt()];

        double sum = 0.0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = reading.nextDouble();
            sum += vector[i];
        }

        double average = sum / vector.length;

        System.out.printf("VECTOR MEDIA = %.3f%n", average);
        System.out.println("ELEMENTS BELOW AVERAGE:");

        for (int i = 0; i < vector.length; i++) {
            if (average > vector[i]) {
                System.out.println(vector[i]);
            }
        }

        reading.close();
    }
}
