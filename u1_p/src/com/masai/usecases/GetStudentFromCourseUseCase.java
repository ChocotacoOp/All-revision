package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.CourceException;

public class GetStudentFromCourseUseCase {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the course name you want to search:");
		String cname = sc.next();
		
		StudentDao dao = new StudentDaoImpl();
		try {
			List<StudentDTO> dtos =  dao.getAllStudentsByCname(cname);
			
			dtos.forEach(dto->System.out.println(dto));
			
		} catch (CourceException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
