package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.UserSession;

@Repository
public interface SessionRepo extends JpaRepository<UserSession, String>{

	public UserSession findByuuId(String uuId);
}
