package com.project.spring_6_rest_mvc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.project.spring_6_rest_mvc.controller.BeerController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Spring6RestMvcApplication {

	public static void main(String[] args) {
		//ApplicationContext g = 
				SpringApplication.run(Spring6RestMvcApplication.class, args);
				
				char x = 'X';
				int i = 0;
				log.info("{}", true ? x : 0);
				log.info("{}", false ? i : x);
//		 BeerController myController = g.getBean(BeerController.class);
//		 System.out.println(myController.listBeers());
				
//				ArrayList<Integer> arrayList = new ArrayList<>();
//				HashSet<Integer> hashset = new HashSet<>();
//				TreeSet<Integer> treeset = new TreeSet<>();
//				LinkedList<Integer> linkedList = new LinkedList<>();
//				LinkedHashSet<Integer> linkedHashset = new LinkedHashSet<>();
//				int[] numbers = {5, 7, 3, 5, 1};
//				for(int number : numbers) {
//					arrayList.add(number);
//					hashset.add(number);
//					treeset.add(number);
//					linkedList.add(number);
//					linkedHashset.add(number);
//				}
//				System.out.println(arrayList);
//				System.out.println(hashset);
//				System.out.println(treeset);
//				System.out.println(linkedList);
//				System.out.println(linkedHashset);
}
}