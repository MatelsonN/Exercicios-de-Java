package basicExercises;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        int end = 0;
        Scanner reading = new Scanner(System.in);

        while (end != 4) {
            System.out.println("Enter 1 for alcohol, 2 for gasoline, 3 for diesel, and 4 for exit: ");
            int value = reading.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Successfully made alcohol supply.");
                    alcohol += 1;
                    break;
                case 2:
                    System.out.println("Successful gasoline supply.");
                    gasoline += 1;
                    break;
                case 3:
                    System.out.println("Diesel supply successfully made.");
                    diesel += 1;
                    break;
                case 4:
                    System.out.println("THANK YOU VERY MUCH!");
                    end = 4;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
                }
            }

        System.out.println("Alcohol = " + alcohol);
        System.out.println("gasoline = " + gasoline);
        System.out.println("Diesel = " + diesel);

        reading.close();
        }
}
