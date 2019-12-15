package com.example.register;

public class Specification {
    private String name;
    private int totalMoney;
    private int totalFives;
    private int totalOnes;

    public Specification(String name, int totalMoney, int totalFives, int totalOnes){
        this.name = name;
        this.totalMoney = totalMoney;
        this.totalFives = totalFives;
        this.totalOnes = totalOnes;
    }

    public void editSpecification(String name, int totalMoney, int totalFives, int totalOnes) {
        this.name = name;
        this.totalMoney = totalMoney;
        this.totalFives = totalFives;
        this.totalOnes = totalOnes;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getTotalMoney() {
        return this.totalMoney;
    }

    public int getTotalFives() {
        return this.totalFives;
    }

    public int getTotalOnes() {
        return this.totalOnes;
    }
}
