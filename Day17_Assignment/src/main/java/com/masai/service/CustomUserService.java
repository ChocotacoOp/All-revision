package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.model.SecurityUser;
import com.masai.model.Student;
import com.masai.repository.CourseRepo;
import com.masai.repository.StudentRepo;

@Service
public class CustomUserService implements UserDetailsService{
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Student student = studentRepo.findByStudentName(username);
		if(student!=null)
		return new SecurityUser(student);
		else {
			throw new UsernameNotFoundException("User not Exist");
		}
		
	}

}
