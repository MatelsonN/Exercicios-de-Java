package Exercises.interfaces.exercise2.service;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);
}
