package Exercises.arrayList.exercise8;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        int[] vector = new int[reading.nextInt()];

        int sum = 0;
        int sumLength = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = reading.nextInt();
            if (vector[i] % 2 == 0) {
                sum += vector[i];
                sumLength += 1;
            }
        }

        if (sum > 0) {
            double average = sum/sumLength;
            System.out.printf("PAIR AVERAGE = %.1f", average);
        }
        else {
            System.out.println("NO EVEN NUMBERS");
        }

        reading.close();
    }
}
