package com.example.collection;

import java.util.HashSet;

public class MainClass {
	static HashSet<String> names=new HashSet<>();
	
	public static void main(String[] args) {
		names.add("shooney");
		names.add("superman");
		names.add("betman");
		
		for (String name : names) {
			System.out.println(name);
			names.remove(name);
		}
		
		for (String name : names) {
			System.out.println(name);
			names.remove(name);
		}
	}

}
