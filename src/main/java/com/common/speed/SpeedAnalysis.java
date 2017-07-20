package com.common.speed;

public class SpeedAnalysis {
	long startTime;
	public void startMethod() {
		startTime = System.currentTimeMillis();
		System.out.println("test Start Time : "+startTime);
	}
	
	public void finishMethod() {
		long finishTime = System.currentTimeMillis();
		System.out.println("test Finish Time : "+finishTime);
		System.out.println("test Time Taken : " + (System.currentTimeMillis() - startTime));
	}
}
