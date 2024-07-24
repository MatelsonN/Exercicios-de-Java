package basicExercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter the values of A, B and C in order: ");
        float valueA = reading.nextFloat();
        float valueB = reading.nextFloat();
        float valueC = reading.nextFloat();
        reading.close();

        float triangleArea = (valueA * valueC) / 2;
        double circleArea = 3.14159 * (Math.pow(valueC, 2));
        float trapezeArea = ((valueA + valueB) / 2) * valueC;
        double squareArea = Math.pow(valueB, 2);
        float rectangleArea = valueA * valueB;

        System.out.printf("TRIANGLE: %.3f\n", triangleArea);
        System.out.printf("CIRCLE: %.3f\n", circleArea);
        System.out.printf("TRAPEZE: %.3f\n", trapezeArea);
        System.out.printf("SQUARE: %.3f\n", squareArea);
        System.out.printf("RECTANGLE: %.3f\n", rectangleArea);


    }
}
