package com.example.foodshop.Models;

public class Step {
    private float number;
    private String step;
    private Ingredient[] ingredients;
    private Ingredient[] equipment;


    // Getter Methods

    public float getNumber() {
        return number;
    }

    public String getStep() {
        return step;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public Ingredient[] getEquipment() {
        return equipment;
    }


    // Setter Methods

    public void setNumber( float number ) {
        this.number = number;
    }

    public void setStep( String step ) {
        this.step = step;
    }

    public void setEquipment(Ingredient[] equipment) {
        this.equipment = equipment;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
}
