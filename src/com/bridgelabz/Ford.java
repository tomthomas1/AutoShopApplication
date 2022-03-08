package com.bridgelabz;
/**
 * created a class Ford that extends the car class
 * We have created year & manufacturerDiscount in this class
 * @author Tom
 *
 */
public class Ford extends Car {
	int year;
	int manufacturerDiscount;

	/**
	 * Parameterized constructor
	 * @param speed - To assign the speed of the ford
	 * @param regularPrice -  To assign the price of the ford 
	 * @param color - to assign the color of the ford
	 * @param year -  to pass the year of mnf of ford
	 * @param manufacturerDiscount - We pass the manufacturerDiscount to the price of regular price
	 */
	public Ford(int speed, double salePrice, String color, int year, int manufacturerDiscount) {
		super(speed, salePrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	/**
	 * We return the price after subtracting the manufacturerDiscount
	 */
	public double getSalePrice() {
		return regularPrice - regularPrice * (manufacturerDiscount / 100.0);
	}
}