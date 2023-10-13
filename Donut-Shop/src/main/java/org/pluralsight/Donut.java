package org.pluralsight;

public class Donut {
    private String type;
    private int calories;
    private double price;
    private String description;

    Donut(String type, int calories, double price, String description) {
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Donut: {type: "+ type +" calories: "+ calories +" price: "+ price +" description: "+ description +"}";
    }

    /*-----Getters-----*/

    public String getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
