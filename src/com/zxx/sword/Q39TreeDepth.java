package com.zxx.sword;

public class Q39TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root == null)return 0;
        int leftH = TreeDepth(root.left);
        int rightH = TreeDepth(root.right);
        return (leftH>rightH?leftH:rightH)+1;
    }

}
