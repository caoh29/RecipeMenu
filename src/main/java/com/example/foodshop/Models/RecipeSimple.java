package com.example.foodshop.Models;

public class RecipeSimple {
    private int id;
    private String title;
    private String image;
    private String imageType;


    // Getter Methods

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getImageType() {
        return imageType;
    }

    // Setter Methods

    public void setId( int id ) {
        this.id = id;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public void setImage( String image ) {
        this.image = image;
    }

    public void setImageType( String imageType ) {
        this.imageType = imageType;
    }

}
