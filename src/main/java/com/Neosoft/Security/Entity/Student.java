package com.Neosoft.Security.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private Integer id;
	private String firstname;
	private String lastname;
	private Long mobilenumber;
	private String email;
	
	@ManyToMany
	@JoinTable(name="student_project",joinColumns = {@JoinColumn(name="student")},inverseJoinColumns = {@JoinColumn(name="project")})
	//@JoinTable(name="user_authority",joinColumns= {@JoinColumn(name="user")},inverseJoinColumns={@JoinColumn(name="authority")})
	private List<Project> project;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	
	
}
