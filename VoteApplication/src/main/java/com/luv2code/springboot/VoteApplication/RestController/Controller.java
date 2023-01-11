package com.luv2code.springboot.VoteApplication.RestController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.VoteApplication.Entity.Singer;
import com.luv2code.springboot.VoteApplication.Service.Service;



@RestController
@RequestMapping("/api")
public class Controller {

	
	private Service service;

	
	@Autowired
	public Controller(Service service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping("/singers/{id}")
	public ResponseEntity<Singer> getById(@PathVariable(name="id") Long id){
		
		return  ResponseEntity.ok(service.getSingerById(id));
	}
	

	@PostMapping("/singers")
	public ResponseEntity<Singer> create(@RequestBody Singer singer){
		
		return new ResponseEntity<>(service.saveSinger(singer) , HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/singers")
	public List<Singer> getPlots(){
		
		return service.getSingers();
	}
	
	
	
	
	
	
	
}
