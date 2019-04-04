package com.zxx.sword;

public class Q17ChangeTreeMirror {
    public void Mirror(TreeNode root) {
        if (root == null)return;
        change(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    public void change(TreeNode root) {
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
