package com.color.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.color.entity.ColorEntity;
import com.color.repository.ColorRepository;

@Service
@Transactional
public class ColorService {
	
	@Autowired
	ColorRepository repo;

	public List<ColorEntity> getColorsList(int modelID) {
		// TODO Auto-generated method stub
		return repo.findAll().stream().filter(z->
		z.getModelId()==modelID).collect(Collectors.toList());
	}
	

}
