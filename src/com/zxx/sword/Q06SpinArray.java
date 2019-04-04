package com.zxx.sword;

public class Q06SpinArray {

    public static int findMin(int[] nums,int start,int end){
        int res = nums[start];
        for(int i = start+1;i <= end;i++){
            if(nums[i] < res){
                res = nums[i];
            }
        }
        return res;
    }

    public static int SpinArray(int[] nums){
        int res = 0;
        if(nums == null || nums.length ==0 ){
            throw new RuntimeException("Invalid input");
        }
        return res;
    }
}
