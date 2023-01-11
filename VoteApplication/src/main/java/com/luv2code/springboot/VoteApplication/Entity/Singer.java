package com.luv2code.springboot.VoteApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="singer")
@Entity
public class Singer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="votes")
	private Long votes;

	public Singer(Long id, String name, Long votes) {
		super();
		this.id = id;
		this.name = name;
		this.votes = votes;
	}
	
	
	
	
	
	public Singer() {
		
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public Long getVotes() {
		return votes;
	}





	public void setVotes(Long votes) {
		this.votes = votes;
	}





	@Override
	public String toString() {
		return "Singer [id=" + id + ", name=" + name + ", votes=" + votes + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
