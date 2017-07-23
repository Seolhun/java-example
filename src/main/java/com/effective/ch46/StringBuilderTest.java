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
		
		/* Created Random String */
		for (int i = 0; i < loopCount; i++) {
			stList.add(i, gr.getRandomString().substring(0, 8));
		}
		
		/* Just Using String */
		SpeedAnalysis sa1 = new SpeedAnalysis();
		sa1.startMethod();
		String sumStr = "";
		for (String string : stList) {
			sumStr += "||"+string;
		}
		sa1.finishMethod();
		
		/* Using StringBuilder Append*/
		SpeedAnalysis sa2 = new SpeedAnalysis();
		sa2.startMethod();
		StringBuilder sb = new StringBuilder();
		for (String string : stList) {
			sb.append("||");
			sb.append(string);
		}
		sa2.finishMethod();

	}

}
