package com.example.interface_abstract.part1;

public abstract class AbstractExample extends AbstractExample2{
	/** 일반 메소드 */
	protected void normalMethod(String queryId) {
		System.out.println("나 일반 메소드야.");
	}
	
	/** 추상 메소드 */
	public abstract void abstractMethod(String queryId);
}
