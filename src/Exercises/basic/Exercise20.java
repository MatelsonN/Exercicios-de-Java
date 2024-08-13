package Exercises.basic;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {

        int valueIn = 0;
        int valueOut = 0;
        Scanner reading = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int x = reading.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("Enter the value to know if it will be in the range [10-20]: ");
            int value = reading.nextInt();

            if (value >= 10 && value <= 20) {
                valueIn += 1;
            } else {
                valueOut += 1;
            }
        }
        System.out.println(valueIn + " in");
        System.out.println(valueOut + " out");

        reading.close();
    }
}