package com.example.foodshop.Models;

public class AnalyzeInstruction {
    private String name;
    private Step[] steps;


    // Getter Methods

    public String getName() {
        return name;
    }

    public Step[] getSteps() {
        return steps;
    }

    // Setter Methods

    public void setName( String name ) {
        this.name = name;
    }

    public void setSteps( Step[] steps) {
        this.steps = steps;
    }

}
