package Exercises.inheritanceAndPolymorphism.exercise2.entity;

public class ImportedProduct extends Product {

    private Double CustomsFee;

    public ImportedProduct(){
    }

    public ImportedProduct(String nome, Double price, Double CustomsFee){
        super(nome, price);
        this.CustomsFee = CustomsFee;
    }

    public Double getCustomsFee(){
        return CustomsFee;
    }

    public void setCustomsFee(Double customsFee){
        this.CustomsFee = customsFee;
    }

    public Double PriceTotal(){
        return getPrice() + CustomsFee;
    }

    @Override
    public String tagPrice() {
        return getName()
                + " R$ "
                + String.format("%.2f", PriceTotal())
                + " (customs fee: R$ "
                + String.format("%.2f", CustomsFee) + ")";
    }
}
