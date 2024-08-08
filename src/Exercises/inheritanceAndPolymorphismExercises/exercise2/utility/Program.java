package Exercises.inheritanceAndPolymorphismExercises.exercise2.utility;

import Exercises.inheritanceAndPolymorphismExercises.exercise2.entity.Product;
import Exercises.inheritanceAndPolymorphismExercises.exercise2.entity.ImportedProduct;
import Exercises.inheritanceAndPolymorphismExercises.exercise2.entity.ProductUsed;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter your product numbers: ");
        int numberOfProducts = reading.nextInt();
        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.println("Product #" + i + " date:");
            System.out.print("common, used or imported (c/u/i)? ");
            char character = reading.next().charAt(0);
            System.out.print("Name: ");
            reading.nextLine();
            String name = reading.nextLine();
            System.out.print("Price: ");
            double price = reading.nextDouble();
            if (character == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = reading.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
            else if (character == 'u') {
                System.out.print("Date of manufacture (DD/MM/YYYY): ");
                Date dateOfManafacture = sdf.parse(reading.next());
                products.add(new ProductUsed(name, price, dateOfManafacture));
            }
            else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICES:");
        for (Product prod: products) {
            System.out.println(prod.tagPrice());
        }

        reading.close();
    }
}
