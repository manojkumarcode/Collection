package com.pojo;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	private String name;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override	
	public boolean equals(Object obj) {
		Employee employee = (Employee)obj;
		return this.empId == employee.empId;
	}
	
	@Override
	public int hashCode() {
		return 10;
	}

	@Override
	public int compareTo(Employee o) {
		//return this.getEmpId()-o.getEmpId();
		
		return o.getEmpId() - this.getEmpId();
	
	
	}


}
