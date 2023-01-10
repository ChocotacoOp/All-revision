package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
