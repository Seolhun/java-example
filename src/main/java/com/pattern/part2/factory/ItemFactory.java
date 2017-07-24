package com.pattern.part2.factory;

import com.pattern.part2.domain.item.Beverage;
import com.pattern.part2.domain.item.Clothing;
import com.pattern.part2.domain.item.Item;
import com.pattern.part2.domain.store.Store;

public class ItemFactory extends AbstractFacotry {

	@Override
	public Store openNewStore(String choice) {
		return null;
	}

	@Override
	public Item producedItem(String choice) {
		if(choice.equalsIgnoreCase("BEVERAGE")){
			return new Beverage();
		} else if(choice.equalsIgnoreCase("CLOTHING")){
			return new Clothing();
		}
		return null;
	}
	
}
