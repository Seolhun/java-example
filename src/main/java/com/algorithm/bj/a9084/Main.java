package com.algorithm.bj.a9084;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/9084
 */

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int INPUT = scan.nextInt();
        scan.close();


        Main mains = new Main();
        int[] coins = {500, 100, 50, 10, 5, 1};
        for (int coin : coins) {
            INPUT = mains.getCountsByCoin(INPUT, coin);
        }
    }

    int getCountsByCoin(int price, int coin) {
        if (price >= coin) {
            int useable_count = price / coin;
            if (useable_count != 0) {
                price = price - (coin * useable_count);
                return price;
            }
        }
        return price;
    }
}
