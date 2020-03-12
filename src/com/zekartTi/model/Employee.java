package com.zekartTi.model;

import java.time.LocalDate;

public class Employee extends Person{
    private String name;
    private String secondName;
    private double salary;
    private LocalDate hireDay;

    public Employee(String dna,String name, String secondName, double salary, int year,int month,int day) {
        super(name,dna);
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    @Override
    public String description() {
        return String.format("an employee with a salary of $%.2f",salary);
    }
    @Override
    public String descriptionHaveDNA() {
        return ", DNA: ".concat(getDna().isEmpty()?"Unknown":getDna());
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double growPercent) {
        double raise = salary * growPercent/100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
