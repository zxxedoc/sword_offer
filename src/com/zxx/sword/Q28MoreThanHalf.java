package com.zxx.sword;

import java.util.HashMap;

public class Q28MoreThanHalf {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0)return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int half = array.length/2;
        for(int i = 0; i < array.length;i++){
            if(map.containsKey(array[i])){
                int count = map.get(array[i]);
                count++;
                map.remove(array[i]);
                map.put(array[i],count);
            }else{
                map.put(array[i],1);
            }
        }
        for(int i = 0;i<array.length;i++){
            if(map.get(array[i])>half){
                return map.get(array[i]);
            }
        }
        return 0;
    }
}
