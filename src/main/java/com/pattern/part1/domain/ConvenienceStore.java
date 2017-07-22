package com.pattern.part1.domain;

import java.util.Date;

public class ConvenienceStore implements Store {
	@Override
	public void open(){
		System.out.println("ConvenienceStore : open() method : "+ new Date());
	}
}