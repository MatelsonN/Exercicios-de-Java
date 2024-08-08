package basicExercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.println("Enter the values of A, B, C, D in sequence: ");
        int first = reading.nextInt();
        int second = reading.nextInt();
        int third = reading.nextInt();
        int fourth = reading.nextInt();

        reading.close();

        int difference = first * second - third * fourth;

        System.out.println("Difference of A x B - C x D = " + difference);
    }
}
