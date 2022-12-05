package com.masai.service;

import java.util.List;

import com.masai.exception.PostException;
import com.masai.model.Post;

public interface PostService {

	public Post createPost(Post post)throws PostException;
	public List<Post> getAllPost()throws PostException;
	public Post getPostById(Integer pid)throws PostException;
	public Post updatePost(Post post) throws PostException;
	public String deletePost(Integer pid)throws PostException;
}
