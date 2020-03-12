package com.zekartTi.model;

public class Manager extends Employee {
    private double bonus;

    public Manager(String dna,String name, String secondName, int salary, int year, int month, int day) {
        super(dna,name, secondName, salary, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
