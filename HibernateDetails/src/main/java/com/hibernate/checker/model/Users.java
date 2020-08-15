package com.hibernate.checker.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;*/


@Entity
/*
 * @Setter
 * 
 * @Getter
 * 
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 */
public class Users {
	@Id
	private Integer id;
	@Column
	private  String firstName;
	@Column
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name="location_id")
	private  Location location;
	@Column
	private String email;
	
	@OneToMany(mappedBy="user")
	private List<Posts> post;
	
	
	// default constructor
	public Users() {
	}

	// paramerterized constructor
	public Users(Integer id, String firstName, String lastName, Location location, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.email = email;
	}

	// getter & setter public Integer getId() { return id; }

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@JsonBackReference
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	//problem code infinite recursing
	@JsonManagedReference
	public List<Posts> getPost() {
		return post;
	}

	public void setPost(List<Posts> post) {
		this.post = post;
	}
	
}
