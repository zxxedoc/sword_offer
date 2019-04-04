package com.zxx.sword;

/**
 * 对n级台阶，可以从1,2，...，n-1跳上来，再加上一次跳上来
 */
public class Q09HardJumpStage {
    public int JumpFloorII(int target){
        int[] res = new int[target+1];
        res[0] = 0;
        for(int i = 1;i<res.length;i++){
            int sum = 0;
            for(int j = 0;j<i;j++){
                sum += res[j];
            }
            sum += 1;
            res[i] = sum;
        }
        return res[target];
    }
}
