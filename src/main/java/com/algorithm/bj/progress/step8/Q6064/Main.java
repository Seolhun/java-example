package com.algorithm.bj.progress.step8.Q6064;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/6064
 */

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/6064
 */

// 메모리 11728 KB
// 속도 156 MS
public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int query = Integer.parseInt(reader.readLine());

        while (query-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int M = Integer.parseInt(tokenizer.nextToken()), N = Integer.parseInt(tokenizer.nextToken());
            int x = Integer.parseInt(tokenizer.nextToken()), y = Integer.parseInt(tokenizer.nextToken());

            writer.write(String.valueOf(year(M, N, x, y)) + "\n");
        }
        writer.flush();
    }

    private static int year(int M, int N, int x, int y) {
        int max = LCM(M, N);
        for (int year = x; year <= max; year += M) {
            if (year % N == y || (year % N == 0 && y == N)) {
                return year;
            }
        }
        return -1;
    }

    private static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    private static int GCD(int a, int b) {
        int mod;
        while (true) {
            mod = a % b;
            if (mod == 0) {
                break;
            }
            a = b;
            b = mod;
        }
        return b;
    }
}
