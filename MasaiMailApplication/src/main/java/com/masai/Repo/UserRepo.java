package com.masai.Repo;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{

	@Query("from User u where u.mailId=?1")
	public User findUserByEmail(String mailId);
}
