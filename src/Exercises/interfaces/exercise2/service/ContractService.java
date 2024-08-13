package Exercises.interfaces.exercise2.service;

import Exercises.interfaces.exercise2.entities.Contract;
import Exercises.interfaces.exercise2.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    public OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate date = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(date, quota));
        }
    }
}
