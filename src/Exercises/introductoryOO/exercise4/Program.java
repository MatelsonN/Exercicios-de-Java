package Exercises.introductoryOO.exercise4;

import Exercises.introductoryOO.exercise4.utility.Real;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("What is the price of the dollar: ");
        Real.dollar = reading.nextDouble();
        System.out.print("What is the total dollar for conversion: ");
        Real.ValueDollar = reading.nextDouble();

        System.out.printf("Amount paid in reais: %.2f", Real.dollarConverter());
        reading.close();
    }

}
