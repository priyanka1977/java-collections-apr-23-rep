package com.training.example.java.set;

import com.training.example.java.data.Employee;

public class TestHashCodeOfObjects {

	
	public static void main(String[] args) {
		
		  Employee employee1 = new Employee("Tom", "Developer", 45, 80000);
		  Employee employee2 = new Employee("Tom", "Developer", 45, 80000);
		  
		  // Every object can be represented as int value
		  // This is typically implemented by converting the internal address of the object into an integer value
		  System.out.println("HashCode of employee1 - " +  employee1.hashCode()); // int value
		  System.out.println("HashCode of employee2 - " + employee2.hashCode()); // int value 
		
		  System.out.println("reference of employee1 - " + employee1);
		  System.out.println("reference of employee2 - " + employee2);
	}
}
