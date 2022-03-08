package com.bridgelabz;

/**
 * Class sedan than extends car
 * We have created variable length and amount here
 * @author Tom
 *
 */
public class Sedan extends Car {
	int length;
	double amount;

	/**
	 *  Parameterized constructor
	 * @param speed  - we pass the speed of the sedan
	 * @param regularPrice - we pass the price of the sedan
	 * @param color -  to pass the color of the sedan
	 * @param length - to pass the length to calculate the price
	 */
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;

	}

	/**
	 * We have created this method to calculate the discount price of the sedan.
	 * //If length is >20 feet,then 5% discount. 
	 * Otherwise, 10% discount.
	 */
	public double getSalePrice() {
		double discount, salePrice;
		if (length > 20) {
			System.out.println("\n Sedan's length is greater than 20 feet: 5% discount:");
			discount = regularPrice * 5 / 100;
			System.out.println(" Discount amount is : " + discount);

		} else {
			System.out.println("\n Sedan has a discount of 10% discount:");
			discount = regularPrice * 10 / 100;
			System.out.println(" Discount amount is : " + discount);

		}
		/**
		 * Then we deduct the doscount from the regular price
		 */
		salePrice = regularPrice - discount;
		return salePrice;
	}
}