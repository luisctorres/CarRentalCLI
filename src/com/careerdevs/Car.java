package com.careerdevs;

public class Car {
    public String make;
    public String model;
    public Boolean isRented;

    //constructor
    public Car(String make, String model, Boolean isRented) {
        this.make = make;
        this.model = model;
        this.isRented = isRented;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return make + " " + model;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(Boolean rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}

