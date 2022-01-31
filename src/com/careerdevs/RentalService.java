package com.careerdevs;

import java.util.ArrayList;

public class RentalService {

    public static void main(String[] args) {
        //Print Greeting
        System.out.println("Welcome to the Car Rental CLI");

        //Empty array to store cars into
        ArrayList<Car> carStorage = new ArrayList<>();

        //Call constructor to create instances of Car
        Car toyotaCamry = new Car("Toyota", "Camry", false);
        Car hondaAccord = new Car("Honda", "Accord", false);
        Car chevyImpala = new Car("Chevy", "Impala", false);

        //adding all cars into carStorage
        carStorage.add(0, toyotaCamry);
        carStorage.add(1, hondaAccord);
        carStorage.add(2, chevyImpala);



    }







}
