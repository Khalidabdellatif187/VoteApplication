package com.luv2code.springboot.VoteApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.VoteApplication.Entity.Singer;



public interface Repository extends JpaRepository<Singer , Long>  {

	
	
}
