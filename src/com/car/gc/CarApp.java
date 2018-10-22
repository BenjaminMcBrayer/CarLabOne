//Benjamin McBrayer, 5.7.2018
//This Java console program creates an inventory of cars.

package com.car.gc;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> carList = new ArrayList<>();
		int userNum = 0;

		System.out.println("Welcome to the Grand Circus Motors admin console!");

		// Ask user how many cars to enter.
		userNum = Validator.getInt(scnr, "How many cars would you like to add to the list? \n");

		// Take and store input for each car.
		for (int i = 0; i < userNum; ++i) {
			String make = Validator.getString(scnr, "Please enter the make: \n");
			String model = Validator.getString(scnr, "Please enter the model: \n");
			int year = Validator.getInt(scnr, "Please enter the year: \n");
			double price = Validator.getDouble(scnr, "Please enter the price: \n");
			carList.add(new Car(make, model, year, price));
		}

		// Print table of cars.
		System.out.print("CurrentInventory:\n");
		for (Car value : carList) {
			System.out.print(value);
		}

	}
}