package com.masai.practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many number you want fibonacci ?");
		int n =sc.nextInt();
		
		fibonacci(n);
	}

	public static void fibonacci(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		int n1 =0;
		int n2 =1;
		while(count<n) {
			
			System.out.println(n1);
			
			int n3 =n1+n2;
			
			n1=n2;
			n2=n3;
			
			count++;
		}
	}
}
