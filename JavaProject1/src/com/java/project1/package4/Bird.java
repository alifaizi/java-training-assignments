package com.java.project1.package4;

public class Bird {
	
	// Assigning value to variables through constructor or initialize through constructor
	String name;
	int age;
	String color;
	String livingArea;
	
	// Constructor: Access Modifier + Name class + parenthesis + curly braces
	
	// Constructor is always same as the Class Name
	// We have three types constructors: 
	// 1 - Default, 
	// 2 - No Argument Constructor, 
	// 3 - Parameterized 
	
	// Default Constructor:
	// We do not create it. It gets created in the background
	
	// No Argument Constructor:
	public Bird() {
	}
	
	// Parameterized Constructor:
	public Bird(String name, int age, String color, String livingArea) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.livingArea = livingArea;
	}
	
	public static void main(String[] args) {
		
		Bird eagle = new Bird("Bald Eagle", 15, "Grey", "Forest"); 
		
		System.out.println("Bird name: " + eagle.name);
		System.out.println("Bird age: " + eagle.age);
		System.out.println("Bird color: " + eagle.color);
		System.out.println("Bird Living Area: " + eagle.livingArea);	
	}
}