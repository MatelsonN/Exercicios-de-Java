package basicExercises;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {

        int result= 1;
        Scanner reading = new Scanner(System.in);
        int value = reading.nextInt();

        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        System.out.println(result);
        reading.close();
    }
}
