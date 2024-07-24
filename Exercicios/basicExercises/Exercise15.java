package basicExercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter your salary amount: ");
        double value = reading.nextDouble();

        double tax;
        if (value <= 2000) {
           tax = 0.0;
        } else if (value <= 3000) {
           tax = (value - 2000) * 0.18;
        } else if (value <= 4500) {
            tax = (value - 3000) * 0.18 + 1000.0 * 0.08;
        } else {
            tax = (value - 4500) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
        }

        if (tax == 0.0) {
            System.out.println("Immune");
        } else {
            System.out.println("R$ " + tax);
        }

        reading.close();
    }
}