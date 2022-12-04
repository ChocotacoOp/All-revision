package com.masai.service;

import java.util.List;

import com.masai.model.Post;

public interface PostService {

	public Post createPost(Post post)throws Exception;
	public List<Post> getAllPost()throws Exception;
	public Post getPostById(Integer pid)throws Exception;
}
