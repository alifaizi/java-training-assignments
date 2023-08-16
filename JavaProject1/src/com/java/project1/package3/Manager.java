package com.java.project1.package3;
public class Manager {
	
	// Variable = Properties
	String name = "Ali";
	double salary = 7534.65;
	String address = "5021 Seminary Road, Alexandria";
	int dob = 1986;
	String workday = "Monday to Friday";
	char gender = 'M';
	
	// Methods = Behavior
	public String manageEmployees() {
	return "Manages employees in their day to day work.";
	}
	
	public String appraiseEmployeePerformance() {
		return "Reviews employees' performance annually.";
		}

	public static void main(String[] args) {
		
		// Creating object
		Manager manager = new Manager();
		
		System.out.println("Name: " + manager.name);
		System.out.println("Salary: " + manager.salary);
		System.out.println("Address: " + manager.address);
		System.out.println("Date of Birth: " + manager.dob);
		System.out.println("Work Days: " + manager.workday);
		System.out.println("Gender: " + manager.gender);
		
		String manage = manager.manageEmployees();
		String appraise = manager.appraiseEmployeePerformance();
		
		System.out.println(manage);
		System.out.println(appraise);
	}
}