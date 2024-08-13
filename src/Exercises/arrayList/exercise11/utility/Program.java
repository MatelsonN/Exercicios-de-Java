package Exercises.arrayList.exercise11.utility;

import Exercises.arrayList.exercise11.entity.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("How many people do you want to register? ");
        Person[] vector = new Person[reading.nextInt()];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Height of the " + (i+1) + " person: ");
            double height = reading.nextDouble();
            System.out.print("Gender of the " + (i+1) + " person: ");
            char gender = reading.next().charAt(0);
            vector[i] = new Person(height, gender);

        }

        double highestHeight = vector[0].getHeight();
        double lowerHeight = vector[0].getHeight();

        for (int i = 0; i < vector.length; i++) {

            if (vector[i].getHeight() > highestHeight) {
                highestHeight = vector[i].getHeight();
            }
            if (vector[i].getHeight() < lowerHeight) {
                lowerHeight = vector[i].getHeight();
            }
        }

        System.out.printf("Lower height = %.2f%n", lowerHeight);
        System.out.printf("Highest height = %.2f%n", highestHeight);

        double sum = 0.0;
        int women = 0;
        int men = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getGender() == 'F') {
                sum += vector[i].getHeight();
                women += 1;
            }
            else {
                men += 1;
            }
        }

        System.out.printf("Women's Height Average = %.2f%n", (sum/women));
        System.out.printf("Number of men = " + men);
        reading.close();

    }
}
