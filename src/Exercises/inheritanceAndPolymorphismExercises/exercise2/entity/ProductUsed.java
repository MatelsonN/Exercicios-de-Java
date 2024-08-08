package Exercises.inheritanceAndPolymorphismExercises.exercise2.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductUsed extends Product {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dateOfManufacture;

    public ProductUsed(){
    }

    public ProductUsed(String name, Double price, Date dateOfManufacture){
        super(name, price);
        this.dateOfManufacture = dateOfManufacture;
    }

    public Date getDateOfManufacture(){
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture){
        this.dateOfManufacture = dateOfManufacture;
    }

    public String tagPrice() {
        return getName() + " (used)"
                + " R$ "
                + String.format("%.2f", getPrice())
                + " (Date of manufacture: "
                + sdf.format(dateOfManufacture) + ")";
    }
}
