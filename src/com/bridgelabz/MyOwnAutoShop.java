package com.bridgelabz;
/**
 * Main method to implement the methods.
 * @author Tom
 *
 */
public class MyOwnAutoShop {
	public static void main(String[] args) {
		System.out.println("--------------Welcome To The AutoShop-------------");
		
		System.out.println("\n==========================SEDAN=================================");
		//If length>20 feet, 5% discount, Otherwise, 10% discount.

		Sedan sedan = new Sedan(150, 5000, "blue", 10);
		System.out.println(" The price of Sedan car is: " + sedan.getSalePrice());

		Sedan sedan1 = new Sedan(180, 5000, "blue", 50);
		System.out.println(" The price of Sedan car is: " + sedan1.getSalePrice());

		System.out.println("\n==========================FORD=================================");
		//From the sale price computed from Car class,subtract the manufacturer Discount.

		Ford ford1 = new Ford(250, 5000, "blue", 1965, 20);
		System.out.println(" Manafacturing discount is : " + ford1.manufacturerDiscount + "% on the amount of " + ford1.regularPrice);
		System.out.println(" The price of Ford car is: " + ford1.getSalePrice());

		Ford ford2 = new Ford(150, 5000, "red", 2002, 10);
		System.out.println("\n Manafacturing discount is : " + ford2.manufacturerDiscount + "% on the amount of " + ford1.regularPrice);
		System.out.println(" The price of Ford car is : " + ford2.getSalePrice());

		System.out.println("\n===========================TRUCK================================");
		//If weight>2000,10%discount. Otherwise, 20% discount.

		Truck truck = new Truck(100, 5000, "black", 5000);
		System.out.println(" The price of truck is: " + truck.getSalePrice());

		Truck truck1 = new Truck(100, 5000, "black", 1000);
		System.out.println(" The price of truck is: " + truck1.getSalePrice());

		System.out.println("\n===========================CAR================================");

		Car car = new Car(250, 5000, "blue");
		System.out.println(" \n Car Price: " + car.getSalePrice());
	}

}