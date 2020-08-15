package com.hibernate.checker.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
*/
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
public class Location {
 @Id
 private Integer id;
 @Column
 private String name;
 
 @OneToMany(mappedBy="location")
 private List<Users> user;

	// default constructor
	public Location() {
	}

	// parameterized constructor
	public Location(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// setter & getter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//problem code infinite recursing 
	@JsonManagedReference
	public List<Users> getUser() {
		return user;
	}

	public void setUser(List<Users> user) {
		this.user = user;
	}
	 
 
}
