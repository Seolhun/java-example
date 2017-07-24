package com.pattern.part2.domain.item;

import java.util.Date;

import com.pattern.part2.domain.store.Store;

public class Clothing extends ItemDomain implements Item {
    private String gender;
    private int size;
    private Date producedDate;

    public Date getProducedDate() {
		return producedDate;
	}

	public void setProducedDate(Date producedDate) {
		this.producedDate = producedDate;
	}
    
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    

	@Override
    public void makeItem(String name) {
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
		System.out.println("Clothing : detailItem() : "+this.toString());
	}
}