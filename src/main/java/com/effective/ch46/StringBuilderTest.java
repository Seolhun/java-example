package com.effective.ch46;

import java.util.ArrayList;
import java.util.List;

import com.common.random.GenerateRandom;
import com.common.speed.SpeedAnalysis;

public class StringBuilderTest {
	static int loopCount = 10000;
	public static void main(String[] args) {
		GenerateRandom gr = new GenerateRandom();
		List<String> stList = new ArrayList<>();
		
		
		for (int i = 0; i < loopCount; i++) {
			stList.add(i, gr.getRandomString().substring(0, 8));
		}
		
		SpeedAnalysis sa1 = new SpeedAnalysis();
		sa1.startMethod();
		String sumStr = "";
		for (int i = 0; i < 100; i++) {
			sumStr += "||"+stList.get(i);
		}
		System.out.println(sumStr);
		sa1.finishMethod();
//		
//		SpeedAnalysis sa2 = new SpeedAnalysis();
//		sa2.startMethod();
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < loopCount; i++) {
//			sb.append("||");
//			sb.append(stList.get(i));
//		}
//		System.out.println(sb.toString());
//		sa2.finishMethod();

	}

}
