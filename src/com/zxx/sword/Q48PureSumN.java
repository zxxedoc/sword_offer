package com.zxx.sword;

public class Q48PureSumN {
    public int solution(int n){
        int sum = (int)(Math.pow(n,2)+n);
        return sum>>1;
    }
}
