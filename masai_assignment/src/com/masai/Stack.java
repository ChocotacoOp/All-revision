package com.masai;

public class Stack {

	private int top;
	private int size;
	private int[] arr;
	
	public Stack(int n) {
		arr = new int[n];
		size=n;
		top=-1;
	}
	
	public Boolean isFull() {
	    return top == size-1;
	}
	public Boolean isEmpty() {
		return top == -1;
	}
	public int getSize() {
	    return top + 1;
	}
	
//	--------------------------------------------
	public boolean push(int x) {
		if(isFull())
			return false;
		else
			arr[++top] = x;
			return true;
	}
//	--------------------------------------------
	public boolean pop() {
		if(isEmpty())
			return false;
		else
			System.out.println(arr[top--]);
			return true;
	}
//	--------------------------------------------
	public boolean peek() {
		if(isEmpty())
			return false;
		else
			System.out.println(arr[top]);
			return true;
	}
//	--------------------------------------------
	
	public static void main(String [] args) {
		
		Stack stack = new Stack(2);
		
		stack.push(5);
		stack.push(4);
		stack.peek();
		stack.pop();
		stack.push(2);
		stack.peek();
		
		
		
		
	}
	
	
}
