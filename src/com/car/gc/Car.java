//Benjamin McBrayer, 5.7.2018

package com.car.gc;

public class Car {
	private String make;
	private String model;
	private int year;
	private double price;

	public Car() {
		super();
	}

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public String getFormattedPrice() {
		return formatNumber(getPrice());
	}
	public void setPrice(double price) {
		this.price = price;
	}

	private String formatNumber(double x) {
		return String.format("%.2f", x);
	}

	@Override
	public String toString() {
		return String.format("%1$-10s %2$-10s %3$-8s $%4$,-10.2f\n", make, model, year, price);
	}	
}
