package com.pattern.part2.factory;

import com.pattern.part2.domain.item.Item;
import com.pattern.part2.domain.store.Store;

public abstract class AbstractFacotry {
	public abstract Store openNewStore(String store);

	public abstract Item producedItem(String item);
}