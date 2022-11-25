package com.masai.control;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.CourceException;
import com.masai.exceptions.StudentException;

public class StudentControl {

	public static void selectOption() {
		StudentDao dao = new StudentDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1/ Get Student via Roll "+"\n"+"2/ Course allocated for Students");
		int n = sc.nextInt();
		switch(n) {
//===============================================================================		
		case 1:
			System.out.println("--Get Student via Roll No--");
			System.out.println("******************************");
			System.out.println("Enter the roll number you want to get:");
			int roll = sc.nextInt();
			try {
				Student student = dao.getStudentByRoll(roll);
				System.out.println(student);
						
			} catch (StudentException e) {
				System.out.println(e.getMessage());
			}
			break;
//=======================================================================================			
		case 2:
			System.out.println("--Course allocated for Students--");
			System.out.println("**********************************");
			System.out.println("Enter the course name you want to search:");
			String cname = sc.next();

			try {
				List<StudentDTO> dtos =  dao.getAllStudentsByCname(cname);
				
				dtos.forEach(dto->System.out.println(dto));
				
			} catch (CourceException e) {
				System.out.println(e.getMessage());
			}
			break;
//=============================================================================
		default :
			System.out.println("Invalid Entry...!");
			
		}
	}
}
