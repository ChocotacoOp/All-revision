package com.masai.practice;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static String removeDuplicateFromString(String original) {
		String copy = original.toLowerCase();
		
		char [] ch = copy.toCharArray();
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		for(char i:ch) {
			hs.add(i);
		}
		
//		return(hs.toString().replace('[', ' ').replace(']', ' ').replace(',', ' '));
		StringBuilder s = new StringBuilder("");
		
		for(Character i :hs) {
			s.append(i);
		}
		return s.toString();
		
		
	}
	
	public static void main(String [] args) {
		String str= removeDuplicateFromString("rAjat");
		System.out.println(str);
		
		
//		int res=1024;
//		Integer i=res+1;
//		String s = i.toString();
//		char[] ch = s.toCharArray();
//		
//		for(char j:ch)System.out.print(j+" ");
		
		
		String s ="abcde";
		s=s.trim();
		s=s.toUpperCase();
		s=s.substring(3,4);
		System.out.println(s);
	}
	
	
	
}
