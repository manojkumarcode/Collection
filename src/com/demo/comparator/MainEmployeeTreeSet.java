package com.demo.comparator;

import java.util.Set;
import java.util.TreeSet;

import com.pojo.Employee;

public class MainEmployeeTreeSet {
	public static void main(String[] args) {
		//Set<Employee> employees = new TreeSet<Employee>(new EmployeeComparator());
		
		Set<Employee> employees = new TreeSet<Employee>((emp1, emp2) -> emp2.getSalary() - emp1.getSalary());

		employees.add(new Employee());
		employees.add(new Employee(1, "ABC", 12000));
		employees.add(new Employee(33, "XYZ", 12400));	
		employees.add(new Employee(5, "ABC", 12500));
		employees.add(new Employee(89, "ABC", 25000));
		employees.add(new Employee(33, "XYZ", 12500));
		
		System.out.println("Using method reference");
		employees.forEach(System.out::println);
		
		System.out.println("original size: " + employees.size());
//		
//		employees.remove(0);
//		
//		System.out.println("list: " + employees);
//		System.out.println("size: " + employees.size());
//		
		
		employees.remove(new Employee(33, "XYZ", 22000));
		
		System.out.println("list: " + employees);
		System.out.println("size after removing by value: " + employees.size());
		
		boolean contains = employees.contains(new Employee(33, "XYZ", 22000));
		System.out.println("contains:" + contains);
		
		for(Employee e : employees) {
			System.out.println(e.getEmpId()+ ":" + e.getName() );
		}
		
		
		System.out.println("Using foreach method");
		employees.forEach(e -> {
			System.out.println(e.getEmpId()+ ":" + e.getName() );
		});
		
//		
//		System.out.println("Using method reference");
//		employees.forEach(System.out::println);
		
		
	}

}
