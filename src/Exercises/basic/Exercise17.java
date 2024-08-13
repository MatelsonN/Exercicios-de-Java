package Exercises.basic;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        String value = "Not null";
        Scanner reading = new Scanner(System.in);

        while (value != null) {

            System.out.print("Enter the value of X and Y. If you don't type anything, the program will end: ");
            double valueX = reading.nextDouble();
            double valueY = reading.nextDouble();

            if (valueX > 0 && valueY > 0){
                System.out.println("First");
            } else if (valueX > 0 && valueY < 0) {
                System.out.println("Fourth");
            } else if (valueX < 0 && valueY > 0) {
                System.out.println("Second");
            } else if (valueX < 0 && valueY < 0) {
                System.out.println("Third");
            } else {
                System.out.println("Null value, the system will be terminated!");
                value = null;
            }

        }
        reading.close();
    }
}
