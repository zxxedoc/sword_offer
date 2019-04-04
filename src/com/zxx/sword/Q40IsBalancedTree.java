package com.zxx.sword;

import java.math.BigInteger;

public class Q40IsBalancedTree {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null)return false;
        if(Math.abs(TreeDepth(root.left)-TreeDepth(root.right)) <=1 && IsBalanced_Solution(root.left) &&
                IsBalanced_Solution(root.left)) return true;
        return false;


    }
    public int TreeDepth(TreeNode root) {
        if(root == null)return 0;

        int leftH = TreeDepth(root.left);
        int rightH = TreeDepth(root.right);
        return (leftH>rightH?leftH:rightH)+1;
    }
}
