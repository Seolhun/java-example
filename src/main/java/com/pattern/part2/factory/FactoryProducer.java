package com.pattern.part2.factory;

public class FactoryProducer {
	public static AbstractFacotry getFactory(String choice) {
		if (choice.equalsIgnoreCase("ITEM")) {
			return new ItemFactory();

		} else if (choice.equalsIgnoreCase("STORE")) {
			return new StoreFactory();
		}
		return null;
	}
}
