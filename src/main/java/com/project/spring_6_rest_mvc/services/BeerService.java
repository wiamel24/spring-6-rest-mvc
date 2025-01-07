package com.project.spring_6_rest_mvc.services;

import java.util.List;
import java.util.UUID;

import com.project.spring_6_rest_mvc.model.Beer;

public interface BeerService {
	
	Beer getBeerById(UUID id);

	List<Beer> listBeers();
}
