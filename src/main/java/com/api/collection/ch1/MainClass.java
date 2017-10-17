package com.api.collection.ch1;

import java.util.HashSet;

/**
 * The type Main class.
 */
public class MainClass {
	/**
	 * The Names.
	 */
	static HashSet<String> names=new HashSet<>();

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
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
