package com.example.foodshop.Models;

public class RecipeSearch {
    public RecipeSimple[] results;
    private float offset;
    private float number;
    private float totalResults;


    // Getter Methods

    public float getOffset() {
        return offset;
    }

    public float getNumber() {
        return number;
    }

    public float getTotalResults() {
        return totalResults;
    }

    // Setter Methods

    public void setOffset( float offset ) {
        this.offset = offset;
    }

    public void setNumber( float number ) {
        this.number = number;
    }

    public void setTotalResults( float totalResults ) {
        this.totalResults = totalResults;
    }

}
