package com.training.example.java.data;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee>{

	private String name;
	private String jobTitle;
	private int age;
	private int salary;

	public Employee(String name, String jobTitle, int age, int salary) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*@Override
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", age=" + age + ", salary=" + salary + "]";
	}*/

	// business method

	public static List<Employee> getEmployees() {

		List<Employee> listEmployees = new ArrayList<Employee>();
		listEmployees.add(new Employee("Tom", "Developer", 45, 80000));
		listEmployees.add(new Employee("Sam", "Designer", 30, 75000));
		listEmployees.add(new Employee("Bob", "Designer", 45, 134000));
		listEmployees.add(new Employee("Peter", "Programmer", 25, 60000));
		listEmployees.add(new Employee("Tim", "Designer", 45, 130000));
		listEmployees.add(new Employee("Craig", "Programmer", 30, 52000));
		listEmployees.add(new Employee("Anne", "Programmer", 25, 51000));
		listEmployees.add(new Employee("Alex", "Designer", 30, 120000));
		listEmployees.add(new Employee("Bill", "Programmer", 22, 30000));
		listEmployees.add(new Employee("Samuel", "Developer", 28, 80000));
		listEmployees.add(new Employee("John", "Developer", 35, 67000));
		listEmployees.add(new Employee("Patrick", "Developer", 35, 140000));
		listEmployees.add(new Employee("Alice", "Programmer", 35, 80000));
		listEmployees.add(new Employee("David", "Developer", 35, 99000));
		listEmployees.add(new Employee("Jane", "Designer", 30, 82000));
		
		return listEmployees;
	}

	// compare two objects based on Name property
	/*if s1 > s2, it returns positive number  
	  if s1 < s2, it returns negative number  
	 if s1 == s2, it returns 0  
	*/
	@Override
	public int compareTo(Employee employee) {
		
		// Compare two objects on Name property
		/*if(this.getName().length() > employee.getName().length()) {
			return 1;
		}
		else if (this.getName().length() < employee.getName().length()) {
			return -1;
		}
		else {
			return 0;
		}
	  */
		return this.getName().compareTo(employee.getName());
		
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		System.out.println("Compared two object on data");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	
	

}
