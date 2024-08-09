package Exercises.inheritanceAndPolymorphism.exercise3.entity;

public class LegalEntity extends Tax {


    private Integer Employees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualIncome, Integer Employees) {
        super(name, annualIncome);
        this.Employees = Employees;
    }

    public Integer getEmployees() {
        return Employees;
    }

    public void setEmployees(Integer employees) {
        this.Employees = employees;
    }
    @Override
    public Double taxPayable() {
        if (Employees > 10) {
            return getAnnualIncome() * 0.14;
        }
        else {
            return getAnnualIncome() * 0.16;
        }
    }


}
