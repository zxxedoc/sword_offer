package com.zxx.sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q46IsContinuous {
    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length == 0)return false;
        boolean res = false;
        Arrays.sort(numbers);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                map.put(numbers[i],map.get(numbers[i])+1);
            }else {
                map.put(numbers[i],1);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(map.get(numbers[i])>1 && numbers[i] != 0)return false;
        }
        if(numbers[0] == 0 && numbers[1] == 0 && numbers[4]-numbers[2]<=4)return true;
        if(numbers[0] == 0 && numbers[1] != 0 && numbers[4]-numbers[1]<=4)return true;
        if(numbers[0] != 0 && numbers[1] != 0 && numbers[4]-numbers[0]==4)return true;
        if(numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0 && numbers[4] - numbers[3] <= 4)return true;
        if(numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0 && numbers[3] == 0)return true;
        return res;
    }
}
