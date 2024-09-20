package carapp;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    // Constructor
    public Car(int id, String make, String model, int year, String color, double price, String regNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = regNumber;
    }

    // Getters
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return id + ": " + make + " " + model + " (" + year + "), Color: " + color + ", Price: $" + price + ", Reg#: " + registrationNumber;
    }
}
