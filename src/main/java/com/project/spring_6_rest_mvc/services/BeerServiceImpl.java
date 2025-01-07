package com.project.spring_6_rest_mvc.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.project.spring_6_rest_mvc.model.Beer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	private Map<UUID, Beer> beerMap;
	
	public BeerServiceImpl() {
		
		this.beerMap = new HashMap<>();
		
		Beer beer1 = Beer.builder().id(UUID.randomUUID()).beerName("MyBeer").price(1500).build();
		Beer beer2 = Beer.builder().id(UUID.randomUUID()).beerName("MyBeer2").price(2000).build();
		
		beerMap.put(UUID.randomUUID(), beer1);
		beerMap.put(UUID.randomUUID(), beer2);
	}
	
	@Override
	public List<Beer> listBeers(){
		return new ArrayList<>(beerMap.values());
	}
	
	@Override
	public Beer getBeerById(UUID id) {
		
		return beerMap.get(id);
	}
	
}
