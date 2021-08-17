package com.demo.comparator;

import java.util.Comparator;

import com.pojo.Employee;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSalary() - o2.getSalary();
	}

}
