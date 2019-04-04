package com.zxx.sword;

public class Q31FindGreatestSumOfSubArray {
    public int findGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for(int i = 1;i<array.length;i++){
            dp[i] = array[i]>array[i]+dp[i-1]?array[i]:array[i]+dp[i-1];
        }
        int max = dp[0];
        for(int i = 1;i<dp.length;i++){
            if(dp[i]>max){
                max = dp[i];
;            }
        }
        return max;
    }
}
