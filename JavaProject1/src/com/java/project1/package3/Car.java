package com.java.project1.package3;

public class Car {
	
	// Properties
	public String make = "Toyota";
	public String name = "Corolla";
	public int year = 2023;
	public String color = "Blue";
	
	
	// Behavior
	public String getSpeed() {
		
		return "runs 250 miles per hour";
	}
	
	private String loading() {
		return "This car can loads the goods without people";
	}
	
	protected String selfDrive() {
		return "This car is self drive car";
	}
	
	// ----------------------------------------------------------------------
	
	public static void main(String[] args) {
	
	// Creating object of the class
	Car toyota = new Car();
	
	// Storing the object and value in variable
	String makeOfToyota = toyota.make;
	
	// Printing Objects and value	
	System.out.println(makeOfToyota);
	System.out.println(toyota.name);
	System.out.println(toyota.year);
	System.out.println(toyota.color);
	
	System.out.println("---------------------------------------------------");
	
	System.out.println(toyota.getSpeed());
	System.out.println(toyota.loading());
	System.out.println(toyota.selfDrive());
		
	}

}
