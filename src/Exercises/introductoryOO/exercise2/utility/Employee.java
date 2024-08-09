package Exercises.introductoryOO.exercise2.utility;

public class Employee {

    public String name;
    public double salary;
    public double tax;

    public double netSalary() {
        return salary - tax;
    }

    public void salaryIncrease(double percentage) {
       salary += salary * (percentage/100);
    }

    public String toString() {
        return name + " $ " + String.format("%.2f", netSalary());
    }
}

