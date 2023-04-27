package com.training.example.java.list;

import java.util.Comparator;

import com.training.example.java.data.Employee;

public class OrderEmployeeOnAge  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		 return o1.getAge() - o2.getAge();
		
	}
}
