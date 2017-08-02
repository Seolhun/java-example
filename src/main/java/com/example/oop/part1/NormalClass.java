package com.example.oop.part1;

public class NormalClass extends AbstractExample2{
	/** 일반 메소드 */
	protected void normalMethod(String queryId) {
		System.out.println("나는 일반 메소드야.");
	}

	@Override
	public void abstractAnotherMethod(String queryId) {
		System.out.println("나는 상속받은 추상 클레스의 추상 메소드야!!");
	}
}
