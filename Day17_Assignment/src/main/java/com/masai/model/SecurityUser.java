package com.masai.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUser implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	private Student student;
	
	public SecurityUser(Student student) {
		this.student = student;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> grantAuth = new ArrayList<>();
		SimpleGrantedAuthority sga = new SimpleGrantedAuthority(student.getStudentName());
		grantAuth.add(sga);
		return grantAuth;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return student.getStudentName();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return student.getStudentName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
