package com.masai.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TrSet {

	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student(10,"n1", 99));
		ts.add(new Student(11,"n2", 95));
		ts.add(new Student(12,"n3", 87));
		ts.add(new Student(13,"n4", 80));
		ts.add(new Student(14,"n5", 90));
		ts.add(new Student(15,"n6", 90));
		
		System.out.println(ts);
//		System.out.println(ts.size());
		
		
		List<Integer> list = Arrays.asList(10,10,12,12,11,10,15,14);
		
		int res = Collections.frequency(list, 10);
		System.out.println(res);
		int res1=Collections.max(list);
		System.out.println(res1);
		
		int[] arr = {10,12,13,99,13,41};
		
		
	}
}
