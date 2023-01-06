package com.masai.hashmap;

public class Test {
	public static void main(String[] args) {
		
		String s="Abc ddef";
		
		char[] ch = s.toCharArray();
		
		for(int i=ch.length-1 ; i>=0 ; i--) {
			System.out.println(ch[i]);
		}
	}
}
