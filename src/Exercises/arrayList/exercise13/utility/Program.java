package Exercises.arrayList.exercise13.utility;

import Exercises.arrayList.exercise13.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees do you want to register? ");
        int numberOfEmployees = reading.nextInt();

        for (int i = 1; i <= numberOfEmployees; i++){
            System.out.println("\nEmployee #" + i + ":");
            System.out.print("Id: ");
            int id = reading.nextInt();

            while(searchId(employees, id)) {
                System.out.print("ID code already registered. Try again: ");
                id = reading.nextInt();
            }

            System.out.print("Name: ");
            reading.nextLine();
            String name = reading.nextLine();
            System.out.print("Salary: ");
            double salary = reading.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee ID: ");
        int id = reading.nextInt();
        Employee employeeId = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(employeeId == null) {
            System.out.println("Employee ID does not exist.");
        }
        else {
            System.out.print("Enter the amount of the salary increase as a percentage: ");
            double increase = reading.nextDouble();
            employeeId.salaryIncrease(increase);
        }

        System.out.println("\nList of employees:");

        for (Employee object : employees) {
            System.out.println(object);
        }

        reading.close();

    }

    private static boolean searchId(List<Employee> employees, int id) {
        Employee employeeId = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employeeId != null;
    }
}