package Exercises.arrayList.exercise14;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the matrix: ");
        int row = reading.nextInt();
        int column = reading.nextInt();

        int[][] headquarters = new int[row][column];

        for (int i = 0; i < headquarters.length; i++) {
            for (int j = 0; j < headquarters[i].length; j++){
                headquarters[i][j] = reading.nextInt();
            }
        }

        System.out.print("Enter a number to search the headquarters: ");
        int number = reading.nextInt();

        for (int i = 0; i < headquarters.length; i++) {
            for (int j = 0; j < headquarters[i].length; j++){
                if (number == headquarters[i][j]) {
                    System.out.print("\nPosition " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.print("\nLeft: " + headquarters[i][(j-1)]);
                    }
                    if (j < headquarters.length - 1) {
                        System.out.print("\nRight: " + headquarters[i][(j+1)]);
                    }
                    if (i > 0) {
                        System.out.print("\nOn top: " + headquarters[(i-1)][(j)]);
                    }
                    if (i < headquarters.length - 1 ) {
                        System.out.print("\nBelow: " + headquarters[(i+1)][(j)]);
                    }
                }
            }
        }

        reading.close();
    }
}
