package com.careerdevs;

import java.util.ArrayList;

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
            Car toyotaCamry = new Car("Toyota", "Camry", true);
            Car hondaAccord = new Car("Honda", "Accord", true);
            Car chevyImpala = new Car("Chevy", "Impala", true);

            //adding all cars into carStorage
            carStorage.add(0, toyotaCamry);
            carStorage.add(1, hondaAccord);
            carStorage.add(2, chevyImpala);
        }

        private static void mainMenu() {
            int userInput = UI.readInt("Please select a menu option: \n1)Rental Menu \n2)Return Menu \n3)Exit", 1,  3);
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


    private static ArrayList<Car> getAvailableCars() {
        return carStorage.stream().filter(car -> !car.isRented()).collect(Collectors.toCollection(ArrayList::new));
    }

    private static void rentalMenu() {

            ArrayList<Car> availableCars = getAvailableCars();

            //if no vehicles available. inform user and return to mainMenu()
            if (getAvailableCars().size() == 0) {
                System.out.println("No vehicles currently available to rent");
                System.out.println("Returning to main menu...");
                mainMenu();
            } else {
                System.out.println("Available vehicles for rent: ");
                for (int i = 0; i < availableCars.size(); i++) {
                    System.out.println(i+1 + ") " +  availableCars.get(i).getName());
                }

                int userSelection = UI.readInt("Please select from available vehicles", 1, 3)-1;
                System.out.println("Thanks, You've selected a: ");
                System.out.println(availableCars.get(userSelection).getName());

                //Need to add rented car to rentedCars array and change isRented status
                availableCars.get(userSelection).setRented(true);
                //return to main menu
                mainMenu();
            }

    }

    private static ArrayList<Car> getRentedCars() {
        return carStorage.stream().filter(Car::isRented).collect(Collectors.toCollection(ArrayList::new));
    }

    private static void returnMenu() {

            ArrayList<Car> rentedCars = getRentedCars();

            int userSelection = UI.readInt("Would you like to: \n1) Return Vehicle \n2) Return to previous menu", 1, 2);

            switch (userSelection) {
                case 1 -> {
                    //Case1 is the return vehicle sub-menu
                    System.out.println();
                    for (int i = 0; i < rentedCars.size(); i++) {
                        System.out.println(i + 1 + ") " + rentedCars.get(i).getName());
                    }
                    int userReturnSelection = UI.readInt("Which Vehicle are you returning today?: ", 1, 3)-1;
                    System.out.println("Thank you for returning the: ");
                    System.out.println(rentedCars.get(userReturnSelection).getName());
                    rentedCars.get(userReturnSelection).setRented(false);
                    mainMenu();
                }
                case 2 -> mainMenu();
            }

    }
}


