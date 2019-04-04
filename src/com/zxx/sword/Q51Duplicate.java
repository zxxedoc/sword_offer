package com.zxx.sword;

import java.util.Arrays;

public class Q51Duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean res = false;
        if(numbers == null || numbers.length ==0 ){
            duplication[0] = -1;
            return res;
        }
        Arrays.sort(numbers);
        for(int i = 0;i<length-1;i++){
            if(numbers[i] == numbers[i+1]){
                duplication[0]=numbers[i];
                res = true;
                break;
            }
        }
        return res;
    }
}
