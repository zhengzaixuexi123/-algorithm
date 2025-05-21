package org.example;

import java.util.Scanner;

public class test {
/*动态规划
* 把m个篮球放进n个框子*/
    public static int waysToPutBallsInBaskets(int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        // 初始化边界条件
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i > j) {
                    dp[i][j] = dp[j][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - i];
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(waysToPutBallsInBaskets(n, m));
        scanner.close();
    }

}
