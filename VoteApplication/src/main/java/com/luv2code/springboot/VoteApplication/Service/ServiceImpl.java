package com.luv2code.springboot.VoteApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.luv2code.springboot.VoteApplication.CustomExceptions.ResourceNotFoundException;
import com.luv2code.springboot.VoteApplication.Entity.Singer;
import com.luv2code.springboot.VoteApplication.Repository.Repository;

@Service
public class ServiceImpl  implements com.luv2code.springboot.VoteApplication.Service.Service{
	
	
	private Repository repo;
	
	
	
    @Autowired
	public ServiceImpl(Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Singer saveSinger(Singer singer) {
		
	Singer singer1 = new Singer();
	
	singer1.setId(singer.getId());
	singer1.setName(singer.getName());
	singer1.setVotes(singer.getVotes());
	
	repo.save(singer1);
	
	return singer1;
	
	}

	@Override
	public List<Singer> getSingers() {
		
   List<Singer> singers = repo.findAll();
		
		return singers;
	}
		
	

	@Override
	public Singer getSingerById(Long id) {
		
      Singer singer = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("singer", "id", id));
		
		return singer;
		
	}
	
	
	
	
	
	
	

}
