package com.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {
	
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(6);
		set.add(700);
		set.add(78);
		
		System.out.println("Original set:-" + set);
		
		
		set.add(10);
		
		System.out.println("after adding 10 list:-" + set);
		System.out.println("after adding 10 list size:-" + set.size());
		
		
		//list.add("hello");
		
		System.out.println("after adding hello list:-" + set);
		System.out.println("after adding hello list size:-" + set.size());
		//Integer in1 = new Integer(10);
		set.remove(Integer.valueOf(10));
//		Integer val = set
//		System.out.println(val);
		
		set.removeIf((v) -> v > 10);
		
		System.out.println("after adding 10 list:-" + set);
		
		int add = 0;
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			int i = iterator.next();
			System.out.println(i);
			add = add + i;
		}
		
		System.out.println("Total:" + add);
		
		add = 0;
		for(int i : set) {
			add = add + i;
		}
		
		System.out.println("Total:" + add);
		System.out.println("Using consumer");
		
		set.stream().forEach((i) -> {
			System.out.println(i);
		});
		
		set.forEach((i) -> {
			System.out.println(i);
		});
		
		
		set.forEach(System.out::println);
	}

}
