package com.masai.demo;

public class Square implements ShapeDrawer,ShapeDrawerCalculator{

	@Override
	public void calculate() {
		System.out.println("calculating shape for Square !");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing shape for Square !");
		
	}
}