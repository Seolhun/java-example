package com.pattern.part2.domain.store;

import java.util.Date;

public class ShoesStore implements Store {
	@Override
	public void openStore(){
		System.out.println("ShoesStore : open() method : "+ new Date());
	}
} 