package com.pattern.part2;

import com.pattern.part2.domain.item.Item;
import com.pattern.part2.domain.store.Store;
import com.pattern.part2.factory.AbstractFacotry;
import com.pattern.part2.factory.FactoryProducer;

public class AbstractFactoryPatternMain {
	public static void main(String[] args){
		AbstractFacotry itemFactory = FactoryProducer.getFactory("ITEM");
		Item item1 = itemFactory.producedItem("BEVERAGE");
		item1.makeItem("게토레이");
		
		Item item2 = itemFactory.producedItem("CLOTHING");		
		item2.makeItem("시리즈");
		
		AbstractFacotry storeFactory = FactoryProducer.getFactory("STORE");
		Store store1 = storeFactory.openNewStore("CONVENIENCE");
		store1.openStore("GS24");
		
		item1.sendItem(store1);
		store1.receiveItem(item1);
		
		Store store2 = storeFactory.openNewStore("SHOES");
		store2.openStore("금강제화");
		item2.sendItem(store2);
		store2.receiveItem(item2);
	}
}