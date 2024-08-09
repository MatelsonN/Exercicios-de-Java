package Exercises.exceptionHandling.utility;

import Exercises.exceptionHandling.entity.Account;
import Exercises.exceptionHandling.exception.Domainexception;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);


        System.out.println("Enter your account details");
        System.out.print("Number: ");
        int number = reading.nextInt();
        System.out.print("Holder: ");
        reading.nextLine();
        String holder = reading.nextLine();
        System.out.print("Initial balance: ");
        double balance = reading.nextDouble();
        System.out.print("Withdrawal limit: ");
        double limiteSaque = reading.nextDouble();

        Account conta = new Account(number, holder, balance, limiteSaque);

        System.out.println();
        System.out.print("Enter the amount you want to withdraw: ");
        double saldo = reading.nextDouble();

        try {
            conta.withdraw(saldo);
            System.out.printf("New balance: %.2f%n", conta.getBalance());
        } catch (Domainexception e) {
            System.out.println(e.getMessage());
        }

        reading.close();
    }
}
