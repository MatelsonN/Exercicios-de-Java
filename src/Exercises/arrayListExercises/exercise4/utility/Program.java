package arrayListExercises.exercise4.utility;

import arrayListExercises.exercise4.entity.EvenNumber;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        EvenNumber[] vector = new EvenNumber[reading.nextInt()];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            int pair = reading.nextInt();
            vector[i] = new EvenNumber(pair);
        }

        int pairQuantity = 0;

        System.out.println("PAIR NUMBERS:");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i].getPair() % 2 == 0) {
                System.out.print(vector[i].getPair() + " ");
                pairQuantity += 1;
            }
        }

        System.out.print("\nNUMBER OF PAIRS = " + pairQuantity);

        reading.close();
    }
}
