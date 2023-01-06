package com.masai.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1,"rajat");
		hm.put(2,"rahul");
		hm.put(3,"kousik");
		hm.put(4,"tridip");
		
		Set<Integer> keys = hm.keySet();
		
		for(Integer i: keys) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Collection<String> val = hm.values();
		for(String s :val) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		Set<Map.Entry<Integer, String>> set = hm.entrySet();
//		System.out.println(set);
//		using enhanced for loop
		for(Map.Entry<Integer, String> i:set) {
			System.out.println(i.getKey()+"----------------"+i.getValue());
		}
	}
}
