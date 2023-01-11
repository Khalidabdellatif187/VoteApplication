package com.luv2code.springboot.VoteApplication.Winner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.springboot.VoteApplication.Entity.Singer;
import com.luv2code.springboot.VoteApplication.Service.Service;

@Component
public class Winner {
	
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
	private final static Logger logger = LoggerFactory.getLogger(Winner.class);

	private Singer singer;
	
	private Service service;
	
	
	
	










    @Autowired
	public Winner(Singer singer, Service service) {
		super();
		this.singer = singer;
		this.service = service;
	}















	public void getWinner() {
		
		logger.info("\n elections of the two singers will start at this time " + formatter.format(LocalDateTime.now()));
		logger.info("\n please note The duration of Elections is 5 seconds");
		
		try{
			Thread.sleep(5000);
			logger.info("the voting is ending now,No one can vote ");
			
			
		} catch(Exception ex) {
			
		}
		
		Singer singer1 = service.getSingerById(1L);
		Singer singer2 = service.getSingerById(2L);
		
		if(singer1.getVotes() > singer2.getVotes()) {
			logger.info(singer1.getName() + " is the winner ");
		} else {
			logger.info(singer2.getName() + " is the winner");
		}
		
		
		
		
		
		
		
	}
	
	
}
