package Exercises.interfaces.exercise3.application;

import Exercises.interfaces.exercise3.model.entities.AbstractShape;
import Exercises.interfaces.exercise3.model.entities.Circle;
import Exercises.interfaces.exercise3.model.entities.Rectangle;
import Exercises.interfaces.exercise3.model.enums.Color;

import java.util.Locale;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        AbstractShape circle = new Circle(Color.BLACK, 2.0);
        AbstractShape rectangle = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + String.format("%.3f", circle.area()));
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", rectangle.area()));
    }
}
