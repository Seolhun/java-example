package com.pattern.part2.domain.store;

import java.util.Date;

public class ConvenienceStore implements Store {
    @Override
    public void openStore() {
        System.out.println("ConvenienceStore : open() method : " + new Date());
    }
}