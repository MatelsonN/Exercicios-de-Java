package basicExercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = reading.nextInt();
        reading.close();

        if (number >= 0) {
            System.out.println("The number is not negative!");
        } else {
            System.out.println("The number is negative!");
        }

    }
}
