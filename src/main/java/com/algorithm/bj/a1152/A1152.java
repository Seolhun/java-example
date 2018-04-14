package com.algorithm.bj.a1152;

/**
 * @author HunSeol
 * @created_date 2017. 11. 8.
 * @IDE IntelliJ IDEA
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String INPUT = scan.nextLine();
        scan.close();

        String[] questions = INPUT.split(" ");
        Pattern pattern = Pattern.compile("^[A-z]*");
        int count = 0;

        for (String question : questions) {
            Matcher matcher = pattern.matcher(question);
            if (matcher.matches()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
