package com.masai;

public class javaAcademy implements masaiAcademy{

@Override
public boolean criteria() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public int limit() {
	// TODO Auto-generated method stub
	return 10;
}

@Override
public String[] courses() {
	// TODO Auto-generated method stub
	String [] arr ={"JA111","SB101","SB201","RJ101"};
	return arr;
}

@Override
public String lead() {
	// TODO Auto-generated method stub
	return "Albert";
}

public int duration() {
	return 2;
}

public String difficulty() {
	return "Moderate-High";
}
}
