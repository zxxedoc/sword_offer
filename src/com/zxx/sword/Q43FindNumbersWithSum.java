package com.zxx.sword;

import java.util.ArrayList;
import java.util.HashMap;

public class Q43FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if(array == null || array.length == 0)return res;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            map.put(array[i],i);
        }
        for(int i = 0;i<array.length;i++){
            if(map.containsKey(sum - array[i])){
                res.add(array[i]);
                res.add(sum - array[i]);
                break;//第一个满足条件的乘积最小
            }
        }
        return res;
    }
}
