package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.assignment.service.AnimalService;


@RestController
public class AnimalController {
	
	@Autowired
	private AnimalService animalService;
	

	@RequestMapping(value="/animals", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public String getAnimalCountForAllBehaviour(){
		return animalService.getAnimalsBehaviorWiseCount();
	}
	

}
