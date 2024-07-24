package basicExercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter two values with one decimal place for (x e Y): ");
        double valueX = reading.nextDouble();
        double valueY = reading.nextDouble();

        String point;
        if (valueX > 0 && valueY > 0) {
            point = "Q1";
        } else if (valueX < 0 && valueY > 0) {
            point = "Q2";
        } else if (valueX < 0 && valueY <0) {
            point = "Q3";
        } else if (valueX > 0 && valueY <0) {
            point = "Q4";
        } else {
            point = "Origin";
        }

        System.out.println(point);
        reading.close();
    }
}
