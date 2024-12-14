package com.Preethi.assignment.utilities;
import com.Preethi.assignment.employees.*;
public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: $" + employee.getSalary());
    }
	
	public static void printManagerDetails(Manager manager) {
        printEmployeeDetails(manager);
        System.out.println("Team Size: " + manager.getTeamSize());
    }
	
	public static void printDeveloperDetails(Developer developer) {
        printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
