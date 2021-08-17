package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(6);
		list.add(700);
		list.add(78);
		
		System.out.println("Original list:-" + list);
		
		
		list.add(10);
		
		System.out.println("after adding 10 list:-" + list);
		System.out.println("after adding 10 list size:-" + list.size());
		
		
		//list.add("hello");
		
		System.out.println("after adding hello list:-" + list);
		System.out.println("after adding hello list size:-" + list.size());
		//Integer in1 = new Integer(10);
		list.remove(Integer.valueOf(10));
		Integer val = list.get(4);
		System.out.println(val);
		
		list.removeIf((v) -> v > 10);
		
		System.out.println("after adding 10 list:-" + list);
		
		int add = 0;
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			int i = iterator.next();
			System.out.println(i);
			add = add + i;
		}
		
		System.out.println("Total:" + add);
		
		add = 0;
		for(int i : list) {
			add = add + i;
		}
		
		System.out.println("Total:" + add);
		System.out.println("Using consumer");
		
		list.stream().forEach((i) -> {
			System.out.println(i);
		});
		
		list.forEach((i) -> {
			System.out.println(i);
		});
		
		
		list.forEach(System.out::println);
	}

}
