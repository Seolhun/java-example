package com.pattern.part2;

import com.pattern.part2.domain.item.Item;
import com.pattern.part2.domain.store.Store;

public abstract class AbstractFacotry {
    abstract Store openNewStore(long index);

    abstract Item producedByIndex(long index);
}