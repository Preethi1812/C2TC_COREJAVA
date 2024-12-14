package com.Preethi.assignment;
import com.Preethi.assignment.employees.*;
import com.Preethi.assignment.utilities.*;
public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Manager manager = new Manager("Preethi", 01, 800000.0, 10);
	        Developer developer = new Developer("Rita", 02, 600000.0, "Java");
	        System.out.println("Manager Details:");
	        EmployeeUtilities.printManagerDetails(manager);
	        System.out.println("Developer Details:");
	        EmployeeUtilities.printDeveloperDetails(developer);
	}

}
