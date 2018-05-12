package com.algorithm.company.midas.done.Q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. 각 신입사원의 이름(Full Name)은 영문이며, 두 부분 또는 세 부분으로 구성 됩니다.
2. 각 부분은 이름(First Name), 중간이름(Middle Name, 선택적), 성(Last name)이고, 공백으로 구분됩니다.
3. 단, 성(Last Name)에는 하이픈이 추가로 포함 될 수 있습니다.
4. 회사 이름 또한 영문 이며, 각 이메일 주소는 LastFirst@Company.com 형식을 사용해야 합니다.

First는 이름의 머리 글자입니다.
Last는 성입니다.
Company는 회사 이름입니다.
 */
public class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String company = bf.readLine().trim();
        String[] names = bf.readLine().split(",");

        String[] emails = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].trim();
            if (names[i].length() < 1) {
                continue;
            }
            emails[i] = buildEmailId(company, names[i], emails);
        }

        emails = checkDuplicationEmails(emails);
        for (int i = 0; i < emails.length; i++) {
            if (emails[i] != null) {
                System.out.print(emails.length - 1 == i ? emails[i] : emails[i] + ", ");
            }
        }
    }

    static String buildEmailId(String company, String name, String emails[]) {
        String[] nameParts = name.split(" ");
        String first = String.valueOf(name.charAt(0));
        String last = nameParts[nameParts.length - 1];
        if (last.contains("-")) {
            last = last.replace("-", "");
        }
        return (last + first + "@" + company + ".com").toLowerCase();
    }

    static String[] checkDuplicationEmails(String[] emails) {
        for (int i = 0; i < emails.length; i++) {
            int dupl = 1;
            if (emails[i] == null) {
                continue;
            }
            String[] emailParts = emails[i].split("@");
            for (int j = i + 1; j < emails.length; j++) {
                String[] compareEmailParts = emails[j].split("@");
                if (emailParts[0].equals(compareEmailParts[0])) {
                    dupl++;
                    emails[j] = compareEmailParts[0] + dupl + "@" + compareEmailParts[1];
                }
            }
        }
        return emails;
    }
}
