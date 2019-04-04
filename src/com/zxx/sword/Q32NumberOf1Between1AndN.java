package com.zxx.sword;

public class Q32NumberOf1Between1AndN {
    public int numberOf1Between1AndN(int n){
        int res = 0;
        if(n<1)return res;
        for(int i = 1;i <= n;i++){
            Integer N = i;
            String s = N.toString();
            for(int j = 0; j < s.length();j++){
                if(s.charAt(j)=='1'){
                    res++;
                }
            }
        }
        return res;

    }
}
