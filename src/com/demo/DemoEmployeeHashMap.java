package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.pojo.Employee;

public class DemoEmployeeHashMap {

	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<>();
		map.put("aa", new Employee(1, "name", 12345));
		map.put("yy", new Employee(34, "name123", 12345));
		map.put("rt", new Employee(16, "abcd", 19000));

		System.out.println(map);
		System.out.println(map.size());

		map.put("XY", new Employee(1, "name", 12345));

		System.out.println("Duplicate Value");
		System.out.println(map);
		System.out.println(map.size());

		map.put("XY", new Employee(12, "name new", 777));

		System.out.println("Duplicate Value");
		System.out.println(map);
		System.out.println(map.size());
		
		map.forEach((key, value) -> System.out.println(key + " : " + value));
		
		Set<Entry<String, Employee>> entries = map.entrySet();
		Iterator<Entry<String, Employee>> iterator = entries.iterator();
		
		System.out.println("Printing using Iterator");
		
		while(iterator.hasNext()) {
		Entry<String, Employee> entry = iterator.next();
		System.out.println(entry);
		}
		

	}
}
