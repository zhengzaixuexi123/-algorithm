package org.example.greedy_algorithm;

public class greedy {
    int coinChangeGreedy(int[] coins, int atm) {
        int i = coins.length - 1;
        int count = 0;//标识找钱次数
        while (atm > 0) {
            //每次都找到小于等于atm的钱
            while (i > 0 && coins[i] > atm) {
                    i--;
            }
            //找到最适合的coins[i]
            atm -= coins[i];
            count++;
        }
        //返回找钱次数，若找不开则返回-1
        return atm == 0 ? count : -1;
    }


}
