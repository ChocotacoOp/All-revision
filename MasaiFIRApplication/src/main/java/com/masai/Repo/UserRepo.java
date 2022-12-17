package com.masai.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{

	
	@Query("from User u where u.mobileNumber=?1")
	public User findUseByMob(String Mob);

}
