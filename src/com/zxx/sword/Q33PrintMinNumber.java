package com.zxx.sword;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q33PrintMinNumber {
    public String printMinNumber(int [] numbers) {
        StringBuilder sb = new StringBuilder();
        if(numbers == null || numbers.length == 0)return sb.toString();
        int len = numbers.length;
        ArrayList<String> list = new ArrayList<>();
        for(int i =0;i<len;i++){
            list.add(String.valueOf(numbers[i]));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        for(String s :list){
            sb.append(s);
        }
        return sb.toString();
    }
}
