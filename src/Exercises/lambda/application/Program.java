package Exercises.lambda.application;

import Exercises.lambda.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String local = reading.next();
        System.out.print("Enter salary: ");
        double salary = reading.nextDouble();

        System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");

        try (BufferedReader br = new BufferedReader(new FileReader(local))) {

            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> emailList = employees.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(p -> p.getEmail())
                    .sorted().collect(Collectors.toList());

            double salarySum = employees.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            emailList.forEach(System.out::println);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", salarySum));

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

        reading.close();
    }
}
