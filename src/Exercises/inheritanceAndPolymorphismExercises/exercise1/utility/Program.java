package Exercises.inheritanceAndPolymorphismExercises.exercise1.utility;

import Exercises.inheritanceAndPolymorphismExercises.exercise1.entity.Employee;
import Exercises.inheritanceAndPolymorphismExercises.exercise1.entity.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int num = reading.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("Outsourced (y/n)? ");
            char cr = reading.next().charAt(0);
            System.out.print("Name: ");
            reading.nextLine();
            String name = reading.nextLine();
            System.out.print("Hours: ");
            double hours = reading.nextInt();
            System.out.print("Hourly rate: ");
            double valuePerHour = reading.nextDouble();
            if (cr == 'y') {
                System.out.print("Additional cost: ");
                double additionalCost = reading.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCost));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("Payments:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - R$ " + String.format("%.2f", emp.payment()));

        }

        reading.close();
    }
}
