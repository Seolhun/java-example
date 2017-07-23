package com.pattern.part1;

import com.pattern.part1.domain.Store;
import com.pattern.part1.domain.StoreFactory;

public class FactoryPatternDemo {
	public static void main(String[] args){
		StoreFactory storeFactory = new StoreFactory();

		Store store1 = storeFactory.openStore("ShoesStore");
		store1.open();

		Store store2 = storeFactory.openStore("ConvenienceStore");
		store2.open();

		Store store3 = storeFactory.openStore("ClothingStore");
		store3.open();
	}
}