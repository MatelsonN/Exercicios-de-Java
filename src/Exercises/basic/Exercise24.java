package Exercises.basic;

import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int value = reading.nextInt();

        for (int i = 1; i <= value; i++) {

            if (value % i == 0) {
                System.out.println("Result = " + i);
            }
        }
        reading.close();
    }
}

