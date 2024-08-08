package Exercises.introductoryOoExercises.exercise2.application;

import Exercises.introductoryOoExercises.exercise2.utility.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Employee employee = new Employee();
        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("Name: ");
        employee.name = reading.nextLine();
        System.out.print("Gross salary: ");
        employee.salary = reading.nextDouble();
        System.out.print("Tax: ");
        employee.tax = reading.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("How many percentages of increase in salary? ");
        double percentage = reading.nextDouble();
        employee.salaryIncrease(percentage);

        System.out.println("Update: " + employee);
    }

}
