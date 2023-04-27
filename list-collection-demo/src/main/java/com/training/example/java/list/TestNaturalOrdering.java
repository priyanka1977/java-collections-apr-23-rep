package com.training.example.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.example.java.data.Employee;

public class TestNaturalOrdering {

	
	public static void main(String[] args) {
		
		
		 List<Integer> list = new ArrayList<Integer>();
		 list.add(10); // complier will do this - new Integer(10);
		 list.add(2);
		 list.add(1);
		 list.add(4);
		 list.add(6);
		 list.add(2);
		 
		 System.out.println("Before sorting - " + list);
		 
		 // sort the elements in the array
		 Collections.sort(list); // Integer object - written implementation compareTo(Object o)
		 
		 System.out.println("After sorting - " + list);
		 
		 
		 System.out.println("==================================================================");

		 
		 List<Employee> employees = Employee.getEmployees(); 
		 
		 System.out.println("\n \n Before sorting - ");
		 for (Employee employee : employees) {
			
			 System.out.println(employee);
		}
		 
		 // compilation error if Employee class does not implements Comparable - compareTo(
		Collections.sort(employees);
		 
		System.out.println("\n\nAfter sorting - ");
		 for (Employee employee : employees) {
			
			 System.out.println(employee);
		}
		
		 System.out.println("==================================================================");
		 System.out.println("External Ordering");
		 
		 List<Employee> listEmployeesOnAge = Employee.getEmployees(); 
		 
		 System.out.println("\n \n Before Ordering on Age -");
		  for (Employee employee : listEmployeesOnAge) {
			System.out.println(employee);
		}
		 
		 Collections.sort(listEmployeesOnAge, new OrderEmployeeOnAge());
		 
		 System.out.println("\n \n After Ordering on Age -");
		 for (Employee employee : listEmployeesOnAge) {
				System.out.println(employee);
			}
			 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}