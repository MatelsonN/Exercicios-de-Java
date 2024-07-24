package basicExercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter the size of the area: ");
        double size = reading.nextDouble();
        reading.close();

        double pi = 3.14159;
        double area = pi * Math.pow(size, 2);
        System.out.printf("A = %.4f", area);

    }
}
