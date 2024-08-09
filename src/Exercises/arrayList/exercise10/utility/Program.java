package arrayListExercises.exercise10.utility;

import arrayListExercises.exercise10.entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        System.out.print("How many students will be registered? ");
        Student[] vector = new Student[reading.nextInt()];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter name, first and second note of the " + (i+1) + "the student: ");
            reading.nextLine();
            String name = reading.nextLine();
            double firstNote = reading.nextDouble();
            double secondNote = reading.nextDouble();
            vector[i] = new Student(name, firstNote, secondNote);
        }

        System.out.println("Approved students:");

        for (int i = 0; i < vector.length; i ++) {

            if ((vector[i].getFirstNote() + vector[i].getSecondNote()) / 2 >= 6) {
                System.out.println(vector[i].getName());
            }
        }

        reading.close();
    }
}
