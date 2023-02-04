package com.example.recyclerviewapp;

public class Car {

    private int id;
    private final String model;
    private String color;
    private final double dbl;
    private String image;
    private String description;


    public Car(int id, String model, String color, double dbl, String image, String description) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.dbl = dbl;
        this.image = image;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDbl() {
        return dbl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
