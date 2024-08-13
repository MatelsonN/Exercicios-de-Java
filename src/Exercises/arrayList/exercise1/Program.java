package Exercises.arrayList.exercise1;
;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int[] vector = new int[reading.nextInt()];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = reading.nextInt();
            }

        System.out.println("NEGATIVE NUMBERS:");

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }

        reading.close();
    }
}
