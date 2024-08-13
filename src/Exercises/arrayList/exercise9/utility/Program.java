package Exercises.arrayList.exercise9.utility;


import Exercises.arrayList.exercise9.entity.Person;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.print("How many people are you going to type? ");
        Person[] vector = new Person[reading.nextInt()];

        for(int i = 0; i < vector.length; i++) {
            System.out.println("Data from " + (i+1) + "the person:");
            System.out.print("Name: ");
            String name = reading.next();
            System.out.print("Age: ");
            int age = reading.nextInt();
            vector[i] = new Person(name, age);
        }

        String oldPerson = "";
        int personAge = 0;

        for (int i = 0; i < vector.length; i++) {
            if(vector[i].getAge() > personAge) {
                personAge = vector[i].getAge();
                oldPerson = vector[i].getName();
            }
        }

        System.out.print("OLDER PERSON: " + oldPerson);

        reading.close();
    }
}
