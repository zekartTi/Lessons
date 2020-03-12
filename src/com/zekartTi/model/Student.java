package com.zekartTi.model;

public class Student extends Person{
    private String major;

    public Student(String dna,String name, String major) {
        super(name,dna);
        this.major = major;
    }

    @Override
    public String description() {
        return "a student majoring in " + major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                '}';
    }

    @Override
    public String descriptionHaveDNA() {
        return getDna().isEmpty()?getDna():"empty DNA";
    }
}
