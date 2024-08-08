package arrayListExercises.exercise6;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int[] vector = new int[reading.nextInt()];
        int[] vectorA = new int[vector.length];
        int[] vectorB = new int[vector.length];

        System.out.println("Enter the values of vector A:");

        for (int i = 0; i < vector.length; i++) {
            vectorA[i] = reading.nextInt();
        }

        System.out.println("Enter the values of vector B:");

        for (int i = 0; i < vector.length; i++) {
            vectorB[i] = reading.nextInt();
        }

        System.out.println("RESULTING VECTOR:");

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vectorA[i] + vectorB[i]);
        }

        reading.close();
    }
}
