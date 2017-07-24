package com.pattern.part2.domain.store;

import com.pattern.part2.domain.item.Item;

public interface Store {
	void detailStore();
	
    void receiveItem(Item item);
    
    void openStore(String name);
}