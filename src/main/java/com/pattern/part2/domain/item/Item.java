package com.pattern.part2.domain.item;

import com.pattern.part2.domain.store.Store;

public interface Item {
    void sendItem(Store store);
    
    void detailItem();
    
    void makeItem(String name);
}