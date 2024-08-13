package Exercises.basic;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("What is the employee number registered at the firm: ");
        int number = reading.nextInt();
        System.out.print("How many hours worked did the employee have: ");
        float hours = reading.nextFloat();
        System.out.print("What is the value of the employee's hours worked: ");
        float value = reading.nextFloat();
        reading.close();

        float valueWorked = hours * value;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f",valueWorked);
    }
}
