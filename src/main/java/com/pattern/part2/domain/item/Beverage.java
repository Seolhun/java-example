package com.pattern.part2.domain.item;

import java.util.Date;

public class Beverage implements Item {
	private int size; // Volume

	public int getSize(){
		return this.size;
	}

	public void setSize(int size){
		this.size = size;
	}
	

	@Override
	public void madeItem(){
		System.out.println("Beverage : madeItem() : " + this.toString());
	}
	
}