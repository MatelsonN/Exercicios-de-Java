package Exercises.basic;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int x = reading.nextInt();

        for (int i = 0; i <= x; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        reading.close();
    }
}
