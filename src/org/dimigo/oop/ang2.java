package org.dimigo.oop;

public class ang2 {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public ang2(){}

    public ang2(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    public ang2(String company, String model, String color, int maxSpeed){
        this(company,model,color,maxSpeed,0);
    }
    public ang2(String company, String model, String color){
        this(company,model,color,0);
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
