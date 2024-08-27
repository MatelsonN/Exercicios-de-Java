package Exercises.interfaces.exercise5.application;

import Exercises.interfaces.exercise5.services.BrazilInterestService;
import Exercises.interfaces.exercise5.services.InterestService;
import Exercises.interfaces.exercise5.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = reading.nextDouble();
        System.out.print("Months: ");
        int months = reading.nextInt();

        InterestService brazil = new BrazilInterestService(2.0);
        double paymentBrazil = brazil.payment(amount, months);

        InterestService usa = new UsaInterestService(2.0);
        double paymentUsa = usa.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println("Brazil: " + String.format("%.2f", paymentBrazil));
        System.out.println("Usa: " + String.format("%.2f", paymentUsa));

        reading.close();
    }
}
