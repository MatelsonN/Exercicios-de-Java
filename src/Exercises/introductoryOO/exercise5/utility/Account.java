package Exercises.introductoryOO.exercise5.utility;

public class Account {

    private int AccountNumber;
    private String name;
    private double AccountValue;

    public Account(int AccountNumber, String name, double depositInitial){
        this.AccountNumber = AccountNumber;
        this.name = name;
        depositFromAccount(depositInitial);
    }

    public Account(int AccountNumber, String name){
        this.AccountNumber = AccountNumber;
        this.name = name;
    }


    public int getAccountNumber(){
        return AccountNumber;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getAccountValue(){
        return AccountValue;
    }

    public void depositFromAccount(double balance){
        AccountValue += balance;
    }

    public void AccountWithdrawal(double balance){
        AccountValue -= balance + 5.00;
    }

    public String toString(){
        return "Account "
                + AccountNumber
                + ", Name: "
                + name
                + ", Balance: "
                + String.format("%.2f", AccountValue);
    }
}
