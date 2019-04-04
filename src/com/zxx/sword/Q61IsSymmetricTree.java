package com.zxx.sword;

public class Q61IsSymmetricTree {
    boolean isSymmetrical(TreeNode pRoot)
    {
       if(pRoot == null)return true;
       return isEqual(pRoot.left,pRoot.right);
    }

    private boolean isEqual(TreeNode left, TreeNode right) {
        if(left == null && right == null)return true;
        if(left == null || right == null)return false;
        if(left.val!=right.val)return false;
        //递归判断，注意是对称的两个节点，而不是某一节点的两个孩子节点
        return isEqual(left.left,right.right)&&isEqual(left.right,right.left);
    }
}
