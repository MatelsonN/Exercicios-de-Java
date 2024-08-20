package Exercises.compositionEnumeration.exercise1.entity;

import Exercises.compositionEnumeration.exercise1.entity.enums.Position;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private Position position;
    private double baseSalary;
    private Department department;
    private List<Contracts> contracts = new ArrayList<>();

    public Worker(String name, Position position, double baseSalary, Department department) {
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Contracts> getContracts() {
        return contracts;
    }

    public void addContract(Contracts contract) {
        contracts.add(contract);
    }

    public void removeContract(Contracts contract) {
        contracts.remove(contract);
    }

    public double income(int month, int year) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (Contracts con : contracts) {
            calendar.setTime(con.getDate());
            int conMonth = 1 + calendar.get(Calendar.MONTH);
            int conYear = calendar.get(Calendar.YEAR);
            if (conMonth == month && conYear == year) {
                sum += con.totalValue();
            }
        }
        return sum;
    }

}
