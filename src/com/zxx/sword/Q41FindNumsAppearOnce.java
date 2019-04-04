package com.zxx.sword;

import java.util.Arrays;
import java.util.HashMap;

public class Q41FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length == 0)return;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],2);
            }else {
                map.put(array[i],1);
            }
        }
        int i =0;
        for (; i < array.length; i++) {
            if(map.get(array[i])==1){
                num1[0]=array[i];
                break;
            }
        }
        for(int j = i+1;j<array.length;j++){
            if(map.get(array[j])==1){
                num2[0]=array[j];
                break;
            }
        }
    }
}
