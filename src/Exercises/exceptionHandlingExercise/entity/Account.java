package Exercises.exceptionHandlingExercise.entity;

import Exercises.exceptionHandlingExercise.exception.Domainexception;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawalLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawalLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
    }

    public Integer getNumero() {
        return number;
    }

    public void setNumero(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public Double deposit(Double value) {
        return balance += value;
    }

    public Double withdraw(Double value) {
        validateWithdraw(value);
        return balance -= value;
    }

    public void validateWithdraw(Double value) {
        if (value > getWithdrawalLimit()) {
            throw new Domainexception("Withdrawal error: Amount exceeds withdrawal limit");
        } else if (value > getBalance()) {
            throw new Domainexception("Withdrawal error: insufficient balance");
        }
    }
}
