package com.pattern.part2.factory;

import com.pattern.part2.domain.item.Item;
import com.pattern.part2.domain.store.ConvenienceStore;
import com.pattern.part2.domain.store.ShoesStore;
import com.pattern.part2.domain.store.Store;

public class StoreFactory extends AbstractFacotry {

	@Override
	public Store openNewStore(String choice) {
		if(choice.equalsIgnoreCase("CONVENIENCE")){
			return new ConvenienceStore();
		} else if(choice.equalsIgnoreCase("SHOES")){
			return new ShoesStore();
		}
		return null;
	}

	@Override
	public Item producedItem(String choice) {
		// TODO Auto-generated method stub
		return null;
	}

}
