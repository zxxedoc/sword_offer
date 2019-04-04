package com.zxx.sword;

public class Q52MultiplyArray {
    public int[] multiply(int[] A) {
        if(A == null || A.length == 0)return null;
        int[] res = new int[A.length];
        for(int i = 0;i<res.length;i++){
            res[i] = method(A,i);
        }
        return res;
    }
    public int method(int[] A,int index){
        int res = 1;
        for(int i = 0;i<index;i++)res*=A[i];
        for(int i = index+1;i<A.length;i++)res*=A[i];
        return res;
    }
}
