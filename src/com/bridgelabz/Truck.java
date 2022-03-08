package com.bridgelabz;

/**
 *  We have created the class Truck that extends the car class.
 *  In this class we have used inheritance and method overriding
 *  We have taken extra variable weight & amount 
 * @author Tom
 *
 */
public class Truck extends Car {
	int weight;
	double amount;

	/**
	 * We have created a constructor with variables of the class and parent class
	 * @param speed - To assign the speed of the truck
	 * @param regularPrice -  To assign the price of the truck 
	 * @param color - to assign the color of the truck
	 * @param weight - to pass the weight of the truck
	 */
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	/**
	 * We have created this method to check the discount price of the truck.
	 *  If weight>2000,10%discount. Otherwise, 20% discount.
	 *  1. If the weight is more than 2000 then we calculate 10% discount
	 *  2  1. If the weight is less than 2000 then we calculate 20% discount
	 */
	public double getSalePrice() {
		double salePrice, discount;

		if (weight > 2000) {
			System.out.println("\n Truck's weight is greater than 2000: 10% discount");
			discount = regularPrice * 10 / 100;
			System.out.println(" Discount amount is : " + discount);

		} else {
			System.out.println("\n Truck has a discount of 20% discount");
			discount = regularPrice * 20 / 100;
			System.out.println(" Discount amount is : " + discount);

		}
		/**
		 * We subtract the discount with the regular price
		 */
		salePrice = regularPrice - discount;
		return salePrice;
	}
}
