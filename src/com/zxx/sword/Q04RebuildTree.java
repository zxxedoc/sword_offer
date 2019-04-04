package com.zxx.sword;

public class Q04RebuildTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if( pre == null || in == null || pre.length == 0 || in.length ==0){
            return null;
        }
        return reBuildTree(pre,0,pre.length-1,in,0,in.length-1);
    }

    private TreeNode reBuildTree(int[] pre, int prel, int prer, int[] in, int inl, int inr) {
        if(prel>prer)return null;
        TreeNode root = new TreeNode(pre[prel]);
        int index = inl;
        while(index < in.length && in[index] != pre[prel])index++;
        root.left = reBuildTree(pre,prel+1,prel+index-inl,in,inl,index-1);
        root.right = reBuildTree(pre,prel+index-inl+1,prer,in,index+1,inr);
        return root;
    }
}
