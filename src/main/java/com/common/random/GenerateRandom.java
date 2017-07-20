package com.common.random;

import java.util.UUID;

public class GenerateRandom {

	public String getRandomString(){
        String uuid = UUID.randomUUID().toString();
        return uuid;
	}
}
