package com.algorithm.company.midas.done.Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static Pattern idPattern = Pattern.compile("[a-z0-9]{6,12}");
    private static Pattern pwdPattern = Pattern.compile("[a-z0-9]{8,16}");

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String id = bf.readLine();
        String password = bf.readLine();

        System.out.println(solve(id, password) ? "T" : "F");
    }

    static boolean solve(String id, String password) {
        Matcher matcher = idPattern.matcher(id);
        if (!matcher.matches()) {
            return false;
        }

        matcher = pwdPattern.matcher(password);
        if (!matcher.matches()) {
            return false;
        }

        return duplicationPassword(password);
    }

    static boolean duplicationPassword(String password) {
        int dupl = 0;
        for (int i = 0; i < password.length(); i++) {
            if (i + 1 >= password.length()) {
                break;
            }
            char a = password.charAt(i);
            char b = password.charAt(i + 1);
            if (a == b) {
                dupl++;
            } else {
                dupl = 0;
            }
            if (dupl == 2) {
                return false;
            }
        }
        return true;
    }
}
