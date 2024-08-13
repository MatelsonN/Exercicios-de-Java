package Exercises.basic;

import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        System.out.print("Choose any amount: ");
        double value = reading.nextDouble();

        String interval;
        if (value > 0 && value <= 25) {
            interval = "Interval [0,25]";
        } else if (value > 25 && value <= 50) {
            interval = "Interval [25,50]";
        } else if (value > 50 && value <= 75) {
            interval = "Interval [50,75]";
        } else if (value > 75 && value <= 100) {
            interval = "Interval [75,100]";
        } else {
            interval = "Out of range.";
        }

        System.out.printf(interval);
        reading.close();
    }
}
