package com.masai.practice;

import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(null);
		hs.add(null);
		
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		for(Integer i:hs) {
			System.out.println(i);
		}
//////////////////////////////////////////////////////////////////////////		
		HashSet<Student> set = new HashSet<>();
		
		set.add(new Student(10,"rajat", 800));
		set.add(new Student(10,"rajat", 800));
		System.out.println(set.size());
		System.out.println(set);
	}

}
