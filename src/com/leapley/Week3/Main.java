package com.leapley.Week3;


import java.util.Scanner;

/*
Hudson Leapley 1/29/2019
Write a program that prompts a user to enter a temperature in
Fahrenheit, converts it to Celsius, and displays the Celsius
temperature. Separate the code that collects user input, the
code that converts temperatures, and the code that displays the
output into different methods. The program should repeat until
the user enters a value less than -460 (approximately absolute zero).
 */
public class Main {

    static Scanner scan = new Scanner(System.in);

    static double getUserInput(){ //Get user input and return as a float
        System.out.println("Enter the temperature in Fahrenheit to convert to Celsius.(Type a number less than -460 to exit)");
        return scan.nextFloat();
    }

    static double convertTemp(double tempF){ // Convert F to C
        return (tempF-32) * 5/9;
    }

    static void displayOutput(double temperature){ // Output number
        System.out.println("The temperature in Celsius: " + temperature);
    }

    public static void main(String[] args) {
        double userInput;

	    do {
            userInput = getUserInput();
            if (userInput > -461){
                double tempC = convertTemp(userInput);
                displayOutput(tempC);
            }
        }while(userInput > -461); //While temperature is equal to or greater than 460 keep the loop going.
    }
}
