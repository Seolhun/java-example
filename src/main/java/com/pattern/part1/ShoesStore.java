package com.pattern.part1;

import java.util.Date;

public class ShoesStore implements Store {
	@Override
	public void open(){
		System.out.println("ShoesStore : open() method : "+ new Date());
	}
} 