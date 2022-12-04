package com.masai.model;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	
	@Size(min=2 , message = "title should be atleast 2 character")
	private String title;
	@Size(min=10 , message = "title should be atleast 10 character")
	private String description;
	
	@ManyToOne
	private User user;
	
	
	@OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
	private Set<Comment> comments = new HashSet<>();
	
	public Post() {
		
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Post(Integer pid, String title, String description) {
		super();
		this.pid = pid;
		this.title = title;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Post [pid=" + pid + ", title=" + title + ", description=" + description + "]";
	}

	
	
	
	
}
