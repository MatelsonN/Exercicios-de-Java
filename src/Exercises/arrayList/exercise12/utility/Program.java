package Exercises.arrayList.exercise12.utility;

import Exercises.arrayList.exercise12.entity.Hotel;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        Hotel[] vector = new Hotel[10];

        System.out.print("How many rooms will be rented? ");
        int rent = reading.nextInt();

        for (int i = 0; i < rent; i++) {
            System.out.println("Room #" + (i+1) + ":");
            System.out.print("Name: ");
            reading.nextLine();
            String name = reading.nextLine();
            System.out.print("Email: ");
            String email = reading.next();
            System.out.print("Room: ");
            int room = reading.nextInt();

            if (vector[i] != null) {
                System.out.println("Occupied room!");

            } else {
                System.out.println("Reservation(s) completed successfully!");
                int number = room;
                vector[number] = new Hotel(name, email, room);
            }
        }

        System.out.println("Occupied rooms:");

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                System.out.println(vector[i].getRoom() + ": " + vector[i].getName() + ", " + vector[i].getEmail());
            }
        }

        reading.close();
    }
}
