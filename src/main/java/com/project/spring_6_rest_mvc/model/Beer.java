package com.project.spring_6_rest_mvc.model;


import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Beer {

	private UUID id;
	private String beerNamee;
	private int price;
}
