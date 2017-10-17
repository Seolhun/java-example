package com.oop.ch1;

public class Horse extends CommonAnimal implements RideInterface {
	@Override
	public void run() {
		System.out.println(this.getName()+"은(는) 네 발로 뛴다.");
	}

	@Override
	public void youCanRide(String riderName) {
		System.out.println(this.getName()+"은(는) "+riderName+"를 태울 수 있다.");
	}
}
