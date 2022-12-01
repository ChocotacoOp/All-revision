package com.masai.demo;

public class Rectangle implements ShapeDrawer,ShapeDrawerCalculator{

	@Override
	public void calculate() {
		System.out.println("calculating shape for rectangle !");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing shape for rectangle !");
		
	}
}