package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.exceptions.CourceException;
import com.masai.exceptions.StudentException;
import com.masai.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String registerStudent(String name, int marks, String email, String password) {
		
		//default message of method...
		String message = "No data Inserted into the table ";
		
		
		//automatic connection close......
		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement
			("insert into student(name,marks,email,password) value(?,?,?,?)");
			
			ps.setString(1, name);
			ps.setInt(2, marks);
			ps.setString(3, email);
			ps.setString(4,password);
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message="Student Registered successfully..!";
			
		//if there is any error so return that message...	
		}catch (SQLException e) {
			message = e.getMessage();
		}		
		
		
		// return all the messages.........
		return message;
	}
	
	

	@Override
	public String registerStudent2(Student student) {
		String message = "No data Inserted into the table ";
		
		
		//automatic connection close......
		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement
			("insert into student(name,marks,email,password) value(?,?,?,?)");
			
			ps.setString(1, student.getName());
			ps.setInt(2, student.getMarks());
			ps.setString(3, student.getEmail());
			ps.setString(4,student.getPassword());
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message="Student Registered successfully..!";
			
		//if there is any error so return that message...	
		}catch (SQLException e) {
			message = e.getMessage();
		}		
		
		
		// return all the messages.........
		return message;
	}
	
	

	@Override
	public Student getStudentByRoll(int roll) throws StudentException{
		Student student = null;
		
		
		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from student where roll =?");
			ps.setInt(1, roll);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");
				String e =rs.getString("email");
				String p =rs.getString("password");
				
				
				student = new Student(r, n, m, e, p);
			}
			else {
				throw new StudentException("Student does not exist with this roll number"+roll); 
			}
			
		//if there is any error so return that message...	
		}catch (SQLException e) {
			e.printStackTrace();
			throw new StudentException(e.getMessage());
			
		}		
		
		return student;
	}



	@Override
	public Student loginStudent(String username, String password) throws StudentException {
		
		Student student=null;
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from student where email=?  AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");
				String e =rs.getString("email");
				String p =rs.getString("password");
				
				
				student = new Student(r, n, m, e, p);
			}
			else {
				throw new StudentException("Invalid username or password ...!"); 
			}
			
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		return student;
	}



	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		List<Student> students = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");
				String e =rs.getString("email");
				String p =rs.getString("password");
				
				
				Student student = new Student(r, n, m, e, p);
				
				//adding student's data to the list 
				students.add(student);
			}
			
		} catch (SQLException e) {
		
			throw new StudentException(e.getMessage());
		}
		
		if(students.size()==0)
			throw new StudentException("No Student data found "); 	
		
		
		
		return students;
	}



	@Override
	public String registerStudentInACourse(int cid, int roll) throws StudentException, CourceException {
		String message = "Not Registered";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from student where roll=?");
			ps.setInt(1, roll);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				PreparedStatement ps2 =	conn.prepareStatement("select * from course where cid=?");
				ps2.setInt(1, cid);
				ResultSet rs2 = ps2.executeQuery();
				
				if(rs2.next()) {
					PreparedStatement ps3 = conn.prepareStatement("insert into student_courses values(?,?)");
					ps3.setInt(1, cid);
					ps3.setInt(2, roll);
					
					int x = ps3.executeUpdate();
					
					if(x>0)
						message = "Student successfully registered in the Cource !!";
					
					else
						throw new StudentException("Technical error please try again later!");
					
					
					
				}else
					throw new StudentException("Invalid course !! There is no couse with this student id/roll");
				
				
			}else
				throw new StudentException("Invalid student roll ! Please enter a valid roll number");
			
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		return message; 
		
	}



	@Override
	public List<StudentDTO> getAllStudentsByCname(String cname) throws CourceException {

		List<StudentDTO> dtos = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select s.roll, s.name, s.email, c.cname,c.fee from student s INNER JOIN course c INNER jOIN student_courses cs ON s.roll = cs.roll AND c.cid =cs.cid AND c.cname=?");
			ps.setString(1,cname);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int sr = rs.getInt("roll");
				String sn = rs.getString("name");
				String se = rs.getString("email");
				
				String cn = rs.getString("cname");
				int cf = rs.getInt("fee");
				
				StudentDTO dto = new StudentDTO(sr, sn, se, cn, cf); 
				dtos.add(dto);
			}
			
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
		
		if(dtos.isEmpty())
			throw new CourceException("No student found on that course");
		
		
		return dtos;
	}

}
