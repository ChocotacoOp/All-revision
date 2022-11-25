package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Student;
import com.masai.exceptions.StudentException;
import com.masai.utility.DBUtil;

public class AdminDaoImpl implements adminDao{

	@Override
	public String adminLogin(String username, String password) throws StudentException {
		String message="please enter valid username or password";
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from admin where aname=?  AND apass=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				message = "login successfull..!";
				
			}
			else {
				throw new StudentException("Invalid username or password ...!"); 
			}
			
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String addNewCourse(String cname, int fee) throws StudentException {
		String message ="Course Add progress failed";
		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into course(cname,fee) values(?,?)");
			ps.setString(1, cname);
			ps.setInt(2, fee);
			message = "Course Addeed Successfully !";
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		
		
		return message;
	}

	
}
