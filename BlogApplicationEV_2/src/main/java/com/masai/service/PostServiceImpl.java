package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.PostException;
import com.masai.model.Post;
import com.masai.repo.PostRepo;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostRepo prepo;
	
	@Override
	public Post createPost(Post post) throws PostException {
		
			return prepo.save(post);
	}

	@Override
	public List<Post> getAllPost() throws PostException {
		List<Post> posts= prepo.findAll();
		
		if(posts.size()==0)
			throw new PostException("No post Available");
		else
			return posts;
	}

	@Override
	public Post getPostById(Integer pid) throws PostException {
		
		Optional<Post> post = prepo.findById(pid);
		
		if(post.isPresent()) {
			return post.get();
		}
		else
			throw new PostException("No post found with this ID :"+pid);
	}

	@Override
	public Post updatePost(Post post) throws PostException {
		Optional<Post> exist = prepo.findById(post.getPid());
		
		if(exist.isPresent())
			return prepo.save(post);
		else
			throw new PostException("No post exist with this Id:"+post.getPid());
	}

	@Override
	public String deletePost(Integer pid) throws PostException {
		Optional<Post> exist = prepo.findById(pid);
		if(exist.isPresent()) {
			prepo.delete(exist.get());
			return "Post deleted Successfully !!";
		}else
			throw new PostException("No post found with this ID:"+pid);
			
			
	}

}
