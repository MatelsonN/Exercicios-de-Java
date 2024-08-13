package Exercises.arrayList.exercise3.utility;

import Exercises.arrayList.exercise3.entity.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("How many people do you want to register: ");
        Person[] vector = new Person[reading.nextInt()];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Data from " + (i+1) + "the person:");
            System.out.print("name: ");
            reading.nextLine();
            String name = reading.nextLine();
            System.out.print("age: ");
            int age = reading.nextInt();
            System.out.print("height: ");
            double height = reading.nextDouble();
            vector[i] = new Person(name, age, height);
        }

        double sumHeight = 0.0;
        double value = 0.0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getAge() < 16) {
                value += 1.0;
            }
            sumHeight += vector[i].getHeight();

        }

        double averageHeight = sumHeight / vector.length;
        double personMinorAge = (value / vector.length) * 100.0;

        System.out.printf("Average height: %.2f", averageHeight);
        System.out.printf("People under 16 years of age: %.1f%%%n", personMinorAge);

        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getAge() < 16) {
                System.out.println(vector[i].getName());
            }
        }

        reading.close();
    }
}
