package com.zxx.sword;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;
import java.util.LinkedList;


public class Q42ContinuousSequenceSumTo100 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(sum <= 0)return res;
        int start = 1,end = 2;
        while(start<(1+sum)/2){
            int sum1 = sumtwo(start,end);
            if(sum1 == sum ){
                ArrayList<Integer> seq = new ArrayList<>();
                for(int i = start;i<=end;i++)seq.add(i);
                res.add(seq);
                start++;
            }
            if(sum1<sum)
                end++;
            if(sum1>sum)
                start++;
        }
        return res;
    }
    int sumtwo(int a,int b){
        int sum = 0;
        for(int i =a;i<=b;i++){
            sum += i;
        }
        return sum;
    }
}
