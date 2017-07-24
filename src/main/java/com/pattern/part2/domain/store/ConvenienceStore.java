package com.pattern.part2.domain.store;

import java.util.Date;

import com.pattern.part2.domain.item.Item;

public class ConvenienceStore extends StoreDomain implements Store {
	private String category;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
    @Override
    public void openStore(String name) {
    	this.setName(name);
		System.out.println("ShoesStore : " +this.getName()+" Opend, Date : "+ new Date());
    }

	@Override
	public void receiveItem(Item item) {
		System.out.println("ConvenienceStore : receiveItem() : "+item.toString());
	}

	@Override
	public void detailStore() {
		System.out.println("ConvenienceStore : detailStore() : "+this.toString());
	}
}