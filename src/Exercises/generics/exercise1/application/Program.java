package Exercises.generics.exercise1.application;

import Exercises.generics.exercise1.services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        PrintService printList = new PrintService();

        System.out.print("How many values? ");
        int value = reading.nextInt();

        for (int i = 0; i < value; i++) {
            printList.addValue(reading.nextInt());
        }

        printList.print();
        System.out.println("First: " + printList.first());
        reading.close();
    }
}
