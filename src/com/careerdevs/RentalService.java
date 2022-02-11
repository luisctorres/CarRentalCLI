package com.careerdevs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RentalService<userInput> {

    private static ArrayList<Car> carStorage;

    public static void main(String[] args) {
        //Print Greeting
        System.out.println("Welcome to the Car Rental CLI");
        initializeCarStorage();
        mainMenu();


    }


        private static void initializeCarStorage() {
            //Empty array to store cars into
            carStorage = new ArrayList<>();

            //Call constructor to create instances of Car
            Car toyotaCamry = new Car("Toyota", "Camry", false);
            Car hondaAccord = new Car("Honda", "Accord", false);
            Car chevyImpala = new Car("Chevy", "Impala", false);

            //adding all cars into carStorage
            carStorage.add(0, toyotaCamry);
            carStorage.add(1, hondaAccord);
            carStorage.add(2, chevyImpala);


        }



        private static ArrayList<Car> getAvailableCars() {
            return carStorage.stream().filter(car -> !car.isRented()).collect(Collectors.toCollection(ArrayList::new));
        }


        private static void mainMenu() {
            int userInput = UI.readInt("Please select a menu option: ", 1,  3);
            switch(userInput){
                case 1:
                    rentalMenu();
                    break;
                case 2:
                    returnMenu();
                    break;
                case 3:
                    break;
            }

    }

        private static void rentalMenu() {

            ArrayList<Car> availableCars = getAvailableCars();

            System.out.println("Available Cars: ");
            for (int i = 0; i < availableCars.size(); i++) {
                System.out.println(i+1 + ") " +  availableCars.get(i).getName());
            }

            System.out.println("Please select from available vehicles");
            int userSelection = UI.readInt("Please select from available vehicles", 1, 3);
            System.out.println("You have selected a: ");
            System.out.println(availableCars.get(userSelection).getName());
    }

        private static void returnMenu() {

    }
}


