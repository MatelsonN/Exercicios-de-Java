package Exercises.introductoryOoExercises.exercise5;

import Exercises.introductoryOoExercises.exercise5.utility.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        Account client;

        System.out.print("Enter your account number: ");
        int AccountNumber = reading.nextInt();
        System.out.print("Enter the username of the account: ");
        reading.nextLine();
        String name = reading.nextLine();
        System.out.print("Want to make an initial deposit (y/n)? ");
        char question = reading.next().charAt(0);

        if (question == 'y') {
            System.out.print("Enter the initial deposit amount: ");
            double depositInitial = reading.nextDouble();
            client = new Account(AccountNumber, name, depositInitial);
        }
        else {
            client = new Account(AccountNumber, name);
        }

        System.out.println("Account date: ");
        System.out.print(client);

        System.out.print("\nEnter the deposit amount: ");
        client.depositFromAccount(reading.nextDouble());
        System.out.println("Updating the account date: ");
        System.out.print(client);

        System.out.print("\nEnter the withdrawal amount: ");
        client.AccountWithdrawal(reading.nextDouble());
        System.out.println("Updating the account date: ");
        System.out.print(client);

        reading.close();
    }

}
