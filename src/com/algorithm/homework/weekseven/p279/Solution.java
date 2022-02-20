package com.algorithm.homework.weekseven.p279;


/**
 * @author qiuch
 * Time complexity : O(n*sqrt(n))
 * Space complexity : O(n)
 */
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            //取min初始化为大值
            dp[i] = n;
            //j^2为物品体积，正循环为完全背包
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(new Solution().numSquares(i * i * i));
        }
    }
}
