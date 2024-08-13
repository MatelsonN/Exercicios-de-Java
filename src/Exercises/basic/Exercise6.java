package Exercises.basic;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("Enter the code of the first part: ");
        int firstPiece = reading.nextInt();
        System.out.print("Enter the first part number: ");
        int firstPartNumber = reading.nextInt();
        System.out.print("Enter the unit value of the first piece chosen: ");
        float firstUnitValue = reading.nextFloat();
        System.out.print("Enter the second part code: ");
        int secondPiece = reading.nextInt();
        System.out.print("Enter the second part number: ");
        int secondPieceNumber = reading.nextInt();
        System.out.print("Enter the unit value of the second chosen piece: ");
        float secondUnitValue = reading.nextFloat();
        reading.close();

        float amountToBePaid = (firstPartNumber * firstUnitValue) + (secondPieceNumber * secondUnitValue);

        System.out.printf("AMOUNT TO PAY: R$ %.2f", amountToBePaid);
    }
}
