package com.zxx.sword;

import java.util.ArrayList;

public class Q65KthNode {
    ArrayList<TreeNode> list = new ArrayList<>();
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot == null || k ==0)return null;
        inOrder(pRoot);
        if(k>list.size())return null;
        else return list.get(k-1);
    }

    private void inOrder(TreeNode pRoot) {
        if(pRoot == null)return;
        inOrder(pRoot.left);
        list.add(pRoot);
        inOrder(pRoot.right);
    }


}
