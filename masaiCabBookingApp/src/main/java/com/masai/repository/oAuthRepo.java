package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.oAuth;

@Repository
public interface oAuthRepo extends JpaRepository<oAuth, Integer> {
	
	@Query("select e from oAuth e where e.mobileNumber=?1")
	public oAuth findByemail(String mobile);

}
