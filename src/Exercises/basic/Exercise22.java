package basicExercises;

import java.util.Scanner;
import java.util.Locale;

public class Exercise22 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = reading.nextInt();

        for (int i = 0; i < integer; i++) {
            System.out.print("Enter two values: ");
            double value1 = reading.nextDouble();
            double value2 = reading.nextDouble();

            if (value2 != 0) {
                double result = value1 / value2;
                System.out.printf("%.1f\n", result);
            } else {
                System.out.println("Impossible division.");
            }
        }
        reading.close();
    }
}
