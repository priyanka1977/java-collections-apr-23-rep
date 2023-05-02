package com.training.example.java.set;

import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
		
		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		
		studentMap.put("1", new Student(1, "john", 35)); // added
		studentMap.put("1", new Student(1, "john", 35)); // ignored - no duplicate Key
		studentMap.put("2", new Student(1, "john", 35)); // added
		studentMap.put("3", new Student(2, "jill", 56)); // added
		
		
		
		System.out.println(studentMap);
		
		
	}
}
