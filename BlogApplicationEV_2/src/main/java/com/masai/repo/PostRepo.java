package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Post;
import com.masai.model.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	public Post findByUser(User user);
}
