package com.masai.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer cid;
	private String cname;
	private Integer fee;
	
	
	@ManyToMany(cascade = CascadeType.ALL ,mappedBy = "courses")
	private Set<Student> students = new HashSet<>();
	
	
	
	public Course() {
		
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(cname, fee);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(cname, other.cname) && Objects.equals(fee, other.fee);
	}




	public Integer getCid() {
		return cid;
	}



	public void setCid(Integer cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public Integer getFee() {
		return fee;
	}



	public void setFee(Integer fee) {
		this.fee = fee;
	}



	public Set<Student> getStudents() {
		return students;
	}



	public void setStudents(Set<Student> students) {
		this.students = students;
	}


//
//	public Course(Integer cid, String cname, Integer fee, Set<Student> students) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		this.fee = fee;
//		this.students = students;
//	}



	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fee=" + fee + ", students=" + students + "]";
	}
	
	
}
