package com.hibernate.checker.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
public class Posts {
 @Id
 private Integer id;
 @Column
 private LocalDateTime postDates;
 
 @ManyToOne
 @JoinColumn(name="user_id")
 private Users user;
 @Column
 private String details;
 
	// default constructor
	public Posts() {
	}

	// parameterized constructor
	public Posts(Integer id, LocalDateTime postDates, Users user, String details) {
		super();
		this.id = id;
		this.postDates = postDates;
		this.user = user;
		this.details = details;
	} // getter & setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getPostDates() {
		return postDates;
	}

	public void setPostDates(LocalDateTime postDates) {
		this.postDates = postDates;
	}
	@JsonBackReference
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	 
}
