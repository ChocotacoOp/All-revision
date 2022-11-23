package com.masai.problem_1;

public class ThreadImpl2 implements Runnable {

	int a=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=10000; i++) {
			a=a+i;
			System.out.println(a);
		}
	}
	

}
