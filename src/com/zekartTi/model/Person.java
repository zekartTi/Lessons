package com.zekartTi.model;

public abstract class Person extends Embrion{
    private String name;
    public abstract String description();

    public Person(String name,String dna) {
        super(dna);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
