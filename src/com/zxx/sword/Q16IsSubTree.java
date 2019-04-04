package com.zxx.sword;

import java.util.*;

class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val){
        this.val = val;
    }
}
public class Q16IsSubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if(root1 != null && root2 != null){
            if (root1.val == root2.val)res = isSubTree(root1,root2);
            if (res == false)res = HasSubtree(root1.left,root2);
            if (res == false)res = HasSubtree(root1.right,root2);
        }
        return res;
    }
    private boolean isSubTree(TreeNode root1,TreeNode root2){
        if(root2 == null)return true;
        if(root1 == null)return false;
        if(root1.val != root2.val)return false;
        return isSubTree(root1.left,root2.left)&&isSubTree(root1.right,root2.right);
    }


}
