package Exercises.inheritanceAndPolymorphism.exercise1.entity;

public class OutsourcedEmployee extends Employee {

    private Double additionalFee;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Double hours, Double valuePerHour, Double additionalFee) {
        super(name, hours, valuePerHour);
        this.additionalFee = additionalFee;
    }

    public Double getAdditionalFee() {
        return additionalFee;
    }

    public void setAdditionalFee(Double additionalFee) {
        this.additionalFee = additionalFee;
    }

    @Override
    public double payment() {
        return super.payment() + additionalFee * 1.1;
    }
}
