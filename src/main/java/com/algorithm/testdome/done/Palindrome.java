package com.algorithm.testdome.done;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        StringBuilder builder = new StringBuilder();
        for (int i = word.length() -1 ; i >= 0; i--) {
            builder.append(word.charAt(i));
        }

        if(!word.toLowerCase().equals(builder.toString().toLowerCase())){
            //throw new UnsupportedOperationException("Not match");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}