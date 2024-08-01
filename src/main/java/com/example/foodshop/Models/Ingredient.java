package com.example.foodshop.Models;

public class Ingredient {
    private float id;
    private String original;
    private String originalName;
    private String name;
    private String nameClean;
    private float amount;
    private String[] possibleUnits;
    private String consistency;
    private String[] shoppingListUnits;
    private String aisle;
    private String image;
    private String[] meta;
    private String[] categoryPath;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getOriginal() {
        return original;
    }

    public String getOriginalName() {
        return originalName;
    }

    public String getName() {
        return name;
    }

    public String getNameClean() {
        return nameClean;
    }

    public float getAmount() {
        return amount;
    }

    public String getConsistency() {
        return consistency;
    }

    public String getAisle() {
        return aisle;
    }

    public String getImage() {
        return image;
    }

    public String[] getPossibleUnits() {
        return possibleUnits;
    }

    public String[] getShoppingListUnits() {
        return shoppingListUnits;
    }

    public String[] getMeta() {
        return meta;
    }

    public String[] getCategoryPath() {
        return categoryPath;
    }

    // Setter Methods

    public void setId( float id ) {
        this.id = id;
    }

    public void setOriginal( String original ) {
        this.original = original;
    }

    public void setOriginalName( String originalName ) {
        this.originalName = originalName;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setNameClean( String nameClean ) {
        this.nameClean = nameClean;
    }

    public void setAmount( float amount ) {
        this.amount = amount;
    }

    public void setConsistency( String consistency ) {
        this.consistency = consistency;
    }

    public void setAisle( String aisle ) {
        this.aisle = aisle;
    }

    public void setImage( String image ) {
        this.image = image;
    }

    public void setCategoryPath(String[] categoryPath) {
        this.categoryPath = categoryPath;
    }

    public void setShoppingListUnits(String[] shoppingListUnits) {
        this.shoppingListUnits = shoppingListUnits;
    }

    public void setMeta(String[] meta) {
        this.meta = meta;
    }

    public void setPossibleUnits(String[] possibleUnits) {
        this.possibleUnits = possibleUnits;
    }
}
