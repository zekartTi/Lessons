package com.zekartTi.model;

public abstract class Embrion {
    private String dna;
    public abstract String descriptionHaveDNA();

    public Embrion(String dna) {
        this.dna = dna;
    }

    public String getDna() {
        return dna;
    }
}
