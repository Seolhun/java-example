package com.oop.ch1;

public class MainClass {
	public static void main(String[] args) {
		Horse horse=new Horse();
		horse.setName("얼룩말");
		horse.setColor("흰색 검은색 줄무늬");
		System.out.println(horse.getName());
		System.out.println(horse.getColor());
		horse.run();
		horse.youCanRide("hooney");
	}
}