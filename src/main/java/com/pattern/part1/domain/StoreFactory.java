package com.pattern.part1.domain;

public class StoreFactory {
	public Store openStore(String storeName) {
		if(storeName == null){
			return null;
		}

		if(storeName.equalsIgnoreCase("ShoesStore")){
			return new ShoesStore();
		} else if(storeName.equalsIgnoreCase("ClothingStore")){
			return new ClothingStore();
		} else if(storeName.equalsIgnoreCase("ConvenienceStore")){
			return new ConvenienceStore();
		}
		return null;
	}
}