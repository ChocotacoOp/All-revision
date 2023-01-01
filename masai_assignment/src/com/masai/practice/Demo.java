package com.masai.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = Arrays.asList(1,2,3,43,32,21,1);
		
		if(list.contains(5)) {
			System.out.println("Yes");
		}else
			System.out.println("No");
		
//		System.out.println(a);
	}
	
}
