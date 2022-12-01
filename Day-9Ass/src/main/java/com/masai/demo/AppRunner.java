package com.masai.demo;

public class AppRunner {
	
//	private Circle app;
	private Rectangle app;
	
	
	public AppRunner(Rectangle app) {
		this.app=app;
	}
	
	public void run() {
		app.calculate();
		app.draw();
	}

}
