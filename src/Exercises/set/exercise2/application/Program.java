package Exercises.set.exercise2.application;

import Exercises.set.exercise2.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        Set<Student> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int courseA = reading.nextInt();

        for (int i = 0; i < courseA; i++) {
            set.add(new Student(reading.nextInt()));
        }

        System.out.print("How many students for course B? ");
        int courseB = reading.nextInt();

        for (int i = 0; i < courseB; i++) {
            set.add(new Student(reading.nextInt()));
        }

        System.out.print("How many students for course C? ");
        int courseC = reading.nextInt();

        for (int i = 0; i < courseC; i++) {
            set.add(new Student(reading.nextInt()));
        }

        System.out.println("Total students: " + set.size());

        reading.close();
    }
}
