package com.masai.demo;

public class Circle implements ShapeDrawer,ShapeDrawerCalculator{

	@Override
	public void calculate() {
		System.out.println("calculating shape for circle !");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing shape for circle !");
		
	}

}
