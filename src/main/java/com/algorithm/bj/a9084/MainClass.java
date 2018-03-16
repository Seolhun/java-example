package com.algorithm.bj.a1152;

/**
 * @author HunSeol
 * @created_date 2017. 11. 8.
 * @IDE IntelliJ IDEA
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int INPUT = scan.next();

        int[] coins = [500, 100, 50, 10, 5, 1];
        for (int coin: coins) {
            INPUT = this.getCountsByCoin(INPUT, coin);
        }

    }

    int getCountsByCoin(int price, int coin) {
        int discount = 0;

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
