package com.careerdevs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RentalService {

    //Scanner
    public Scanner userMenuInput = new Scanner(System.in);

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
            System.out.println(availableCars.get(i).make + " " + availableCars.get(i).model);
        }


    }
}


//To-do
// 1) Need to make a mainMenu() Method
// 2) need to ask user for their choice
// 3) Once selection is made. Move car to rented ArrayList and change isRented (Property?) to = True