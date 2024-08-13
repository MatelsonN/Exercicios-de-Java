package Exercises.basic;

import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner reading = new Scanner(System.in);
        System.out.println("""
                 CODE      SPECIFICATION       PRICE
                  1         Hot dog            R$ 4.00
                  2         X-Salad            R$ 4.50
                  3         X-Bacon            R$ 5.00
                  4         Simple toast       R$ 2.00
                  5         Soft drink         R$ 1.50
                  
                As per the table, choose the item code and quantity: """);
        int code = reading.nextInt();
        int quantity = reading.nextInt();

        double total = 0;

        switch (code) {
            case 1:
            total = quantity * 4.00;
            break;
            case 2:
            total = quantity * 4.50;
            break;
            case 3:
            total = quantity * 5.00;
            break;
            case 4:
            total = quantity * 2.00;
            break;
            case 5:
            total = quantity * 1.50;
            break;
        }

        System.out.printf("TOTAL: R$ %.2f", total);
        reading.close();
    }
}
