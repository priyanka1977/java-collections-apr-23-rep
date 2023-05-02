package com.training.example.java.set;

import java.util.Set;
import java.util.TreeSet;

public class TestPersonObjectBehaviorTreeSet {

	public static void main(String[] args) {

		// TreeSet is based on sorted binary tree
		// compare two object on equality
		Set<String> cities = new TreeSet<String>();

		cities.add("mumbai");

		cities.add("hyderabad");

		cities.add("bangaluru");

		cities.add("mumbai");

		cities.add("kolkata");

		cities.add("mumbai");

		System.out.println("set - " + cities);

	}
}
