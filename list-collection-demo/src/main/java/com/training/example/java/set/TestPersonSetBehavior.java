package com.training.example.java.set;

import java.util.HashSet;
import java.util.Set;

public class TestPersonSetBehavior {

	public static void main(String[] args) {
		
		Set<Person> persons = new HashSet<Person>();
		
		persons.add(new Person(1, "john")); // added
		//persons.add(new Person(2, "jill"));
		persons.add(new Person(1, "john")); 
		//persons.add(new Person(3, "john"));
		persons.add(new Person(1, "john")); 
		persons.add(new Person(4, "peter")); // added 
		persons.add(new Person(1, "anna")); // added
		
		System.out.println("set - " + persons);
		
		
	}
}
