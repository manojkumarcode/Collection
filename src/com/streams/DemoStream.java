package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.pojo.Employee;

public class DemoStream {
	
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,4,2,100,466, 50,30);
		stream.forEach(System.out::println);
		stream = Stream.of(1,4,2,100,466, 50,30, 40);
		stream.forEach(System.out::println);
		
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		//u get stream and do the work and forget about it. 
		// Collection hold the data, Stream does not hold the data
		String[] fruits  = new String[] {"mango", "papaya","guava"};
		Stream<String> fruitsStream = Arrays.stream(fruits);
		fruitsStream.forEach(System.out::println);
		
		System.out.println("Call the empty one");
		
		Stream<String> stream2  = Stream.empty();
		stream2.forEach(System.out::println);
		
		
		
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee());
		employees.add(new Employee(1, "ABC", 12000));
		employees.add(new Employee(33, "XYZ", 22000));	
		employees.add(new Employee(5, "ABC", 12500));
		employees.add(new Employee(89, "ABC", 25000));
		employees.add(new Employee(33, "XYZ", 22000));
		System.out.println("Print employees one");
		
		Stream<Employee> stream3 = employees.stream();
		//stream3.forEach(System.out::println);
		
		stream3.filter((e) -> {
			System.out.println("filter invoked");
			return e.getSalary() > 1000;
		}).count();
		
		//here count is terminal operations
		// And filter is intermediary operations
		
		Stream<Employee> stream4 = employees.stream();
		stream4.filter((e) -> {
			System.out.println("filter invoked findFirst");
			return e.getSalary() > 1000;
		}).findFirst();
		
	}

}
