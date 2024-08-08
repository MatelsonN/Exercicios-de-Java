package Exercises.introductoryOoExercises.exercise1.application;


import Exercises.introductoryOoExercises.exercise1.utility.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        Rectangle valueRectangle = new Rectangle();

        System.out.println("Enter the height and width of the rectangle: ");
        valueRectangle.height = reading.nextDouble();
        valueRectangle.width = reading.nextDouble();

        System.out.printf("AREA = %.2f\n", valueRectangle.area());
        System.out.printf("WIDTH = %.2f\n", valueRectangle.perimeter());
        System.out.printf("HEIGHT = %.2f", valueRectangle.diagonal());

        reading.close();
    }
}
