package com.pattern.part2.domain.item;

public class Clothing implements Item {
    private String gender;
    private int size;

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void madeItem() {
        System.out.println("Beverage : madeItem() : " + this.toString());
    }

}