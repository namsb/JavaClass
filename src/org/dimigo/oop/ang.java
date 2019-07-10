package org.dimigo.oop;

public class ang {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public ang(){}

    public ang(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getCompany() {

        return company;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }
}
