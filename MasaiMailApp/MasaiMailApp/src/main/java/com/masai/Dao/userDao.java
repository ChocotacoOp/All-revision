package com.masai.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.user;

@Repository
public interface userDao  extends JpaRepository<user, Integer>{
	

}
