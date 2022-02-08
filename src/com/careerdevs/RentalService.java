package com.careerdevs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RentalService {

    public static void main(String[] args) {
        //Print Greeting
        System.out.println("Welcome to the Car Rental CLI");

        //Empty array to store cars into
        ArrayList<Car> availableCars = new ArrayList<>();
        ArrayList<Car> rentedCars = new ArrayList<>();

        //Call constructor to create instances of Car
        Car toyotaCamry = new Car("Toyota", "Camry", false);
        Car hondaAccord = new Car("Honda", "Accord", false);
        Car chevyImpala = new Car("Chevy", "Impala", false);

        //adding all cars into carStorage
        availableCars.add(0, toyotaCamry);
        availableCars.add(1, hondaAccord);
        availableCars.add(2, chevyImpala);

        System.out.println("Available Cars: ");
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println(i+1 + ") " +  availableCars.get(i).make + " " + availableCars.get(i).model);
        }

        System.out.println("Please select from available vehicles");
        int userSelection = UI.userMenuInput.nextInt()-1;
        System.out.println("You have selected a: ");
        System.out.println(availableCars.get(userSelection));

    }


        private static void mainMenu() {

    }

        private static void rentalMenu() {

    }

        private static void returnMenu() {

    }
}


