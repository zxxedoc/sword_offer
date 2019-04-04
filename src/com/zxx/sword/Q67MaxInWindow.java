package com.zxx.sword;

import java.util.ArrayList;

public class Q67MaxInWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {  ArrayList<Integer> res = new ArrayList<>();
        if(num == null || num.length == 0 || size == 0 || size > num.length)return res;

        int resLen = num.length - size + 1;
        int maxInWindow;
        for(int i = 0;i < resLen; i++){
            maxInWindow = max(num,i,i+size-1);
            res.add(maxInWindow);
        }
        return res;
    }
    private int max(int[] num,int start,int end){
        int max = num[start];
        for(int i = start + 1;i <= end;i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        return max;
    }
}
