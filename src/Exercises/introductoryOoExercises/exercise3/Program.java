package Exercises.introductoryOoExercises.exercise3;

import Exercises.introductoryOoExercises.exercise3.utility.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Student student = new Student();
        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter the student's name and then the student's three notes: ");
        student.name = reading.nextLine();
        student.firstNote = reading.nextDouble();
        student.secondNote = reading.nextDouble();
        student.thirdNote = reading.nextDouble();

        System.out.println(student);
        reading.close();
    }
}
