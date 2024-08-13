package Exercises.interfaces.exercise2.application;

import Exercises.interfaces.exercise2.entities.Contract;
import Exercises.interfaces.exercise2.entities.Installment;
import Exercises.interfaces.exercise2.service.ContractService;
import Exercises.interfaces.exercise2.service.PaypalService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Among the contract data:");
        System.out.print("Number: ");
        int number = reading.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(reading.next(), dtf);
        System.out.print("Contract value: ");
        double totalValue = reading.nextDouble();

        Contract contract = new Contract(number, date, totalValue);


        System.out.print("Enter the number of installments: ");
        int installments = reading.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installments);

        System.out.println("\ninstallments:");
        for (Installment installment : contract.getInstallments() ) {
            System.out.println(installment);
        }

        reading.close();
    }
}
