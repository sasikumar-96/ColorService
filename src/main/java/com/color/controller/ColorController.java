package com.color.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.color.entity.ColorEntity;
import com.color.service.ColorService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ColorController {
	
	@Autowired
	ColorService service;
	
	@GetMapping("/colors/{modelID}")
	public List<ColorEntity> getColorsList(@PathVariable int modelID){
		
		return service.getColorsList(modelID);
	}
	
	
}
