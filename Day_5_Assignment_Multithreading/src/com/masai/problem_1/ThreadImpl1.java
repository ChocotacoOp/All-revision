package com.masai.problem_1;

public class ThreadImpl1 extends Thread{
	
	
	int a=0;
	
	@Override
   synchronized	public void run() {
		for(int i=1; i<=10000; i++) {
			a=a+i;
			System.out.println(a);
		}
		
	}
	

}
