package com.masai.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.oAuth;

@Repository
public interface oAuthDao extends JpaRepository<oAuth, Integer> {
	
	public oAuth findByemail(String email);

}
