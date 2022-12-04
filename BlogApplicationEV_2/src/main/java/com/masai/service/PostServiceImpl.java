package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.masai.model.Post;
import com.masai.repo.PostRepo;

public class PostServiceImpl implements PostService{

	@Autowired
	private PostRepo prepo;
	
	@Override
	public Post createPost(Post post) throws Exception {
		Optional<Post> opt= prepo.findById(post.getPid());
		if(opt.isEmpty())
			throw new Exception("Post Already Exist !!");
		else
			return prepo.save(post);
	}

	@Override
	public List<Post> getAllPost() throws Exception {
		List<Post> posts= prepo.findAll();
		
		if(posts.size()==0)
			throw new Exception("No post Available");
		else
			return posts;
	}

	@Override
	public Post getPostById(Integer pid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
