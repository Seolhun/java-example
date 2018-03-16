package com.algorithm.company.zigzag;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author HunSeol
 * @created_date 2017. 11. 8.
 * @IDE IntelliJ IDEA
 */
public class ExtractOddNumbers {
    public static void main(String[] args) {
        ExtractOddNumbers extractOddNumbers = new ExtractOddNumbers();
        System.out.println(extractOddNumbers.extractOddNumbers("ab2v9bc13j5jf4jv21"));

    }

    private int extractOddNumbers(String n) {
        int result = 0;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(n);
        while (m.find()) {
            int value = Integer.parseInt(m.group());
            if (Integer.parseInt(m.group()) % 2 != 0) {
                result += Math.pow(value, 2);
            }
        }
        return result;
    }
}
