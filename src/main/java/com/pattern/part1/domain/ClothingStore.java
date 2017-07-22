package com.pattern.part1.domain;

import java.util.Date;

public class ClothingStore implements Store {
	@Override
	public void open(){
		System.out.println("ClothingStore : open() method : "+ new Date());
	}
} 

