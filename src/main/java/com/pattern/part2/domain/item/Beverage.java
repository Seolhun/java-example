package com.pattern.part2.domain.item;

import com.pattern.part2.domain.store.Store;

import java.util.Date;


public class Beverage extends ItemDomain implements Item {
	private int size; // Volume
    private Date producedDate;

    public Date getProducedDate() {
		return producedDate;
	}

	public void setProducedDate(Date producedDate) {
		this.producedDate = producedDate;
	}
	
	public int getSize(){
		return this.size;
	}

	public void setSize(int size){
		this.size = size;
	}

	@Override
	public void makeItem(String name){
		this.setName(name);
        System.out.println("Clothing : makeItem() : " + this.getName());
	}

	@Override
	public void sendItem(Store store) {
		store.detailStore();
		System.out.println("Clothing : sendItem : "+this.getName());
	}
	
	@Override
	public void detailItem() {
		System.out.println("Beverage : detailItem() : "+this.toString());
	}
}