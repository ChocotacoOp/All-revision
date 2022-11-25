package com.masai.dao;

import com.masai.exceptions.StudentException;

public interface adminDao {

	public String adminLogin(String username,String password)throws StudentException;
	
	public String addNewCourse(String cname, int fee)throws StudentException;
}
