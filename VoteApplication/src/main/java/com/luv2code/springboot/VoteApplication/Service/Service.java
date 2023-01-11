package com.luv2code.springboot.VoteApplication.Service;

import java.util.List;

import com.luv2code.springboot.VoteApplication.Entity.Singer;



public interface Service {
	
	
	
public Singer saveSinger(Singer singer);
	
	public List<Singer> getSingers();
	
	public Singer getSingerById(Long id);
	

}
