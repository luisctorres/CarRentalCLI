package com.careerdevs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    public static Scanner userMenuInput = new Scanner(System.in);


    public static int readInt (String question, int min, int max) {
        while (true) {
            try {
                System.out.println(question + "Select a number");
                int userSelect = userMenuInput.nextInt();
                if (userSelect >= min && userSelect <= max) {
                    return userSelect;
                }
                System.out.println("Number must be in range");
            } catch (InputMismatchException e)  {
                System.out.println("You must enter an integer. Please try again");
                userMenuInput.nextLine();
            }
        }
    }


}
