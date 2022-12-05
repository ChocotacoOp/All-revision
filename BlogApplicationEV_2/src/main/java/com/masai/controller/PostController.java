package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.PostException;
import com.masai.model.Post;
import com.masai.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService pserv;
	
	@PostMapping("/posts")
	public ResponseEntity<Post> addNewPost(@RequestBody Post post) throws PostException{
		Post newpost= pserv.createPost(post);
		
		return new ResponseEntity<Post>(newpost,HttpStatus.CREATED);
	}
	
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getAllPost() throws PostException{
		List<Post> posts= pserv.getAllPost();
		
		return new ResponseEntity<List<Post>>(posts,HttpStatus.OK);
	}
	
	@GetMapping("/posts/{pid}")
	public ResponseEntity<Post> getPostById(@PathVariable Integer pid) throws PostException{
		
		Post post = pserv.getPostById(pid);
		return new ResponseEntity<Post>(post,HttpStatus.OK);
	}
	
	@PutMapping("/posts")
	public ResponseEntity<Post> UpdatePost(@RequestBody Post post) throws PostException{
		Post updated= pserv.updatePost(post);
		
		return new ResponseEntity<Post>(updated,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/posts/{pid}")
	public ResponseEntity<String> deletePostById(@PathVariable Integer pid) throws PostException{
		String str= pserv.deletePost(pid);
		
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}
