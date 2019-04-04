package com.zxx.sword;

public class Q22IsPostOrderOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0)return false;
        return isBST(sequence,0,sequence.length-1);
    }

    private boolean isBST(int[] sequence, int l, int r) {
        if(l >= r)return true;
        int root = sequence[r];
        int index = l;
        while(sequence[index] < root)index++;
        for (int i = index;i <= r;i++){
            if (sequence[i] < root)return false;
        }
        return isBST(sequence,l,index - 1) && isBST(sequence,index,r-1);

    }
}
