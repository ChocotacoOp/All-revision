package com.masai;

public class mernAcademy implements masaiAcademy{

	@Override
	public boolean criteria() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int limit() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String[] courses() {
		// TODO Auto-generated method stub
		String [] arr = {"JS101","WEB101","JS201","RCT101","NEM101","RM101"};
		return arr;
	}

	@Override
	public String lead() {
		// TODO Auto-generated method stub
		return "Albert";
	}
	public int duration() {
		return 6;
	}

	public String difficulty() {
		return "Moderate";
	}

}
