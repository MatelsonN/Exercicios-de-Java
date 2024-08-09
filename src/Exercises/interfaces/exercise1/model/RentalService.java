package Exercises.interfaces.exercise1.model;

import Exercises.interfaces.exercise1.entities.CarRental;
import Exercises.interfaces.exercise1.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        double minute = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hour = minute / 60.0;

        double basicPayment;
        if (hour <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hour);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hour / 24.0);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
