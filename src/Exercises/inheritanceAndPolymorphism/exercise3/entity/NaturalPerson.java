package Exercises.inheritanceAndPolymorphism.exercise3.entity;

public class NaturalPerson extends Tax {

    private Double healthExpenditures;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, Double rendaAnual, Double healthExpenditures) {
        super(name, rendaAnual);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double taxPayable() {
        if(getAnnualIncome() >= 20000) {
            if (healthExpenditures > 0) {
                return getAnnualIncome() * 0.25 - healthExpenditures * 0.50;
            }
            else {
                return getAnnualIncome() * 0.25;
            }
        }
        else {
            if (healthExpenditures > 0) {
                return getAnnualIncome() * 0.15 - healthExpenditures * 0.50;
            }
            else {
                return getAnnualIncome() * 0.15;
            }
        }
    }
}
