package com.zxx.sword;

public class Q11NumberOf1InBinary {
    public int NumberOf1(int n) {
        if(n == 0)return 0;
        int count = 0;
        while(n != 0){
            //每次&会消去n最右边的1
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
