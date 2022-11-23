package com.masai.problem_1;

public class Test {

	
	
	
  public static void main(String[] args) throws InterruptedException {
	
	  ThreadImpl1 b=new ThreadImpl1();
	  ThreadImpl2 c=new ThreadImpl2();
	  Thread a=new Thread(c);
	  
	  
	  b.start();
	
	  a.start();
	
	
	  
	  
	  
}
}
