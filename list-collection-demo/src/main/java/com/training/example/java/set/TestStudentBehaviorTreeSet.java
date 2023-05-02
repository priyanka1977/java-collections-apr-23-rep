package com.training.example.java.set;

import java.util.Set;
import java.util.TreeSet;

public class TestStudentBehaviorTreeSet {

	public static void main(String[] args) {

		// TreeSet is based on binary tree
		Set<Student> students = new TreeSet<Student>();
		
		students.add(new Student(1,"john", 35));
		students.add(new Student(5,"jill", 45));
		students.add(new Student(1,"john", 35));
		students.add(new Student(3,"peter", 67));
		
		System.out.println(students);
	}
}
