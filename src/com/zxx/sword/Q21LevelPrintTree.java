package com.zxx.sword;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q21LevelPrintTree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        res.add(root.val);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if (tmp.left != null){
                queue.offer(tmp.left);
                res.add(tmp.left.val);
            }
            if(tmp.right != null){
                queue.offer(tmp.right);
                res.add(tmp.right.val);
            }
        }
        return res;
    }
}
