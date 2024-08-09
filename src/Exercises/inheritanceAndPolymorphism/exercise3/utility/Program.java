package Exercises.inheritanceAndPolymorphism.exercise3.utility;

import Exercises.inheritanceAndPolymorphism.exercise3.entity.Tax;
import Exercises.inheritanceAndPolymorphism.exercise3.entity.NaturalPerson;
import Exercises.inheritanceAndPolymorphism.exercise3.entity.LegalEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        List<Tax> taxes = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int taxpayer = reading.nextInt();
        for (int i = 1; i <= taxpayer; i++){
            System.out.println("Data from taxpayer #" + i + ": ");
            System.out.print("Individual or legal entity (i/l)? ");
            char caracter = reading.next().charAt(0);
            System.out.print("Name: ");
            reading.nextLine();
            String name = reading.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = reading.nextDouble();
            if(caracter == 'i'){
                System.out.print("Health spending: ");
                double healthSpending = reading.nextDouble();
                taxes.add(new NaturalPerson(name, annualIncome, healthSpending));
            }
            else {
                System.out.print("Number of employees: ");
                int employee = reading.nextInt();
                taxes.add(new LegalEntity(name, annualIncome, employee));
            }
        }

        System.out.println();
        double sum = 0.0;
        System.out.println("TAXES PAID:");
        for (Tax tax: taxes){
            System.out.println(tax.getName() + ": R$ " + String.format("%.2f", tax.taxPayable()));
            sum += tax.taxPayable();
        }
        System.out.println();
        System.out.println("Total fees: R$ " + sum);

        reading.close();
    }
}
