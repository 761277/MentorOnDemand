package com.mod.mod.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mod.mod.models.Training;
import com.mod.mod.repository.TrainingRepository;



@RestController
@RequestMapping("/api")
public class TrainingController {
	@Autowired
	private TrainingRepository trainingRepository;
	
	@GetMapping
	public List<Training> list(){
		return trainingRepository.findAll();
		
		
	}
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Training user) {
		trainingRepository.save(user);
		
	}
	
	@GetMapping("/{id}")
	public Training get(@PathVariable("id") String id) {
		return trainingRepository.getOne(id);
		
	}
}
