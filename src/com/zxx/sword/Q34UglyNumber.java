package com.zxx.sword;

public class Q34UglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0)return 0;
        int[] ugly = new int[index];
        ugly[0] = 1;
        int i2 = 0,i3 = 0,i5 = 0;
        for(int i = 1;i<index;i++){
            int tmp = Math.min(ugly[i2]*2,Math.min(ugly[i3]*3,ugly[i5]*5));
            ugly[i] = tmp;
            while (ugly[i2]*2 <= ugly[i])i2++;
            while (ugly[i3]*3 <= ugly[i])i3++;
            while (ugly[i5]*5 <= ugly[i])i5++;
        }
        return ugly[index-1];
    }
}
