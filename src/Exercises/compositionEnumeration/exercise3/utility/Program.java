package Exercises.compositionEnumeration.exercise3.utility;

import Exercises.compositionEnumeration.exercise3.entity.Client;
import Exercises.compositionEnumeration.exercise3.entity.Order;
import Exercises.compositionEnumeration.exercise3.entity.OrderItem;
import Exercises.compositionEnumeration.exercise3.entity.Product;
import Exercises.compositionEnumeration.exercise3.entity.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the customer's details:");
        System.out.print("Name: ");
        String name = reading.nextLine();
        System.out.print("Email: ");
        String email = reading.next();
        System.out.print("Date of birth (DD/MM/YYYY): ");
        Date dateOfBirth = sdf.parse(reading.next());

        Client clients = new Client(name, email, dateOfBirth);

        System.out.println("Enter your order details:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(reading.next());

        Order clientRequest = new Order(new Date(), status, clients);

        System.out.print("How many items for this order? ");
        Integer quanItens = reading.nextInt();
        for (int i = 1; i <= quanItens; i++) {
            System.out.println("Enter the item data " + i + "#:");
            System.out.print("Product Name: ");
            reading.nextLine();
            String productName = reading.nextLine();
            System.out.print("Product Price: ");
            Double productPrice = reading.nextDouble();

            Product products = new Product(productName, productPrice);

            System.out.print("Product Quantity: ");
            Integer quantity = reading.nextInt();

            OrderItem orderRequest = new OrderItem(quantity, productPrice, products);

            clientRequest.addItem(orderRequest);
        }

        System.out.println();
        System.out.println("Order Items:" );
        System.out.println(clientRequest);

        reading.close();

    }
}
