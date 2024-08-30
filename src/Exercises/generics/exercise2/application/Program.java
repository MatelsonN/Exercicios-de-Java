package Exercises.generics.exercise2.application;

import Exercises.generics.exercise2.entities.Product;
import Exercises.generics.exercise2.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String local = "C:\\temp\\in.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(local))){

            String line = reader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = reader.readLine();
            }

            Product product = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(product);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
