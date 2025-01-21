package com.project.spring_6_rest_mvc.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring_6_rest_mvc.model.Beer;
import com.project.spring_6_rest_mvc.services.BeerService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
public class BeerController {
	private final BeerService beerService;
	
	@RequestMapping("/api/v1/beer")
	public List<Beer> listBeers(){
	//System.out.println(beerService.listBeers().size());	
		List<Beer> getall = beerService.listBeers();
		return getall.stream().sorted(Comparator.comparing(Beer::getPrice).reversed()).collect(Collectors.toList());
		
		//return beerService.listBeers();
	}
	
	public Beer getBeerById(UUID id) {
		log.debug("get beer by id - in controller ideas");
		return beerService.getBeerById(id);
	}
	
}
