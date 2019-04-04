package com.zxx.sword;

public class Q38GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        if(array == null || array.length == 0)return count;
        for(int i = 0;i<array.length;i++)
        {
            if(array[i] == k){
                count = 1;
                for(int j = i+1;j < array.length;j++){
                    if(array[j] == k)count++;
                }
                break;
            }
        }
        return count;
    }
}
