package com.pattern.part2.domain.item;

public abstract class ItemDomain {
    private long index;
    private String name;
    
    public long getIndex() {
        return this.index;
    }	
    
    public void setIndex(long index) {
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}