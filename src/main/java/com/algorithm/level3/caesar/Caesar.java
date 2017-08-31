package com.algorithm.level3.caesar;

class Caesar {
    String caesar(String s, int n) {
        String result = "";
        int alphabetLength = 26;

        //n이 알파벳 길이보다 크면 반복이 되므로 줄여준다
        n = n % alphabetLength;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //n을 더한 후 최대값보다 커질 수 있으므로 26으로 나눈 후 다시 A를 더한다
            if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            } else if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Caesar c = new Caesar();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
    }
}
