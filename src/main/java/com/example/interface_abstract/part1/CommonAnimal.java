package com.example.interface_abstract.part1;

public abstract class CommonAnimal {
	private String name;
	private String color;
	
	abstract void run();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
