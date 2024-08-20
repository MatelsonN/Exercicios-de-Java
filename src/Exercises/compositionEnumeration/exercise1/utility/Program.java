package Exercises.compositionEnumeration.exercise1.utility;

import Exercises.compositionEnumeration.exercise1.entity.Contracts;
import Exercises.compositionEnumeration.exercise1.entity.Department;
import Exercises.compositionEnumeration.exercise1.entity.enums.Position;
import Exercises.compositionEnumeration.exercise1.entity.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the name of the department: ");
        String department = reading.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = reading.nextLine();
        System.out.print("What is the position level: ");
        String position = reading.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = reading.nextDouble();
        Worker worker = new Worker(name, Position.valueOf(position), baseSalary, new Department(department));

        System.out.print("How many contracts did the worker have: ");
        int totalContract = reading.nextInt();

        for (int i = 1; i <= totalContract; i++) {
            System.out.println("Enter contract number " + i + ":");
            System.out.print("Date (DD/MM/YYYY)): ");
            Date date = dateFormat.parse(reading.next());
            System.out.print("Value of hour worked: ");
            double valuePerHour = reading.nextDouble();
            System.out.print("Total hours worked: ");
            int hours = reading.nextInt();
            Contracts contract = new Contracts(date, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("Enter the month and year to calculate income (MM/YYYYY): ");
        String monthEYear = reading.next();
        int month = Integer.parseInt(monthEYear.substring(0,2));
        int year = Integer.parseInt(monthEYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Invoicing " + monthEYear + ": " + String.format("%.2f", worker.income(month, year)));
        reading.close();
    }
}
