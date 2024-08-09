package basicExercises;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        int password = 0;
        Scanner reading = new Scanner(System.in);

        while (password != 2002) {

            System.out.println("Enter the 4-number password: ");
            password = reading.nextInt();

            if (password != 2002) {
                System.out.println("Invalid password.");
            }
        }
        System.out.println("Access allowed.");
        reading.close();


    }
}
