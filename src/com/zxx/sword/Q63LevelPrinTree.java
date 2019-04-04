package com.zxx.sword;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q63LevelPrinTree {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if( pRoot == null)return res;
        LinkedList<TreeNode> q1 = new LinkedList<>();
        LinkedList<TreeNode> q2 = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        q1.offer(pRoot);
        list.add(pRoot.val);
        res.add(list);

        while(!q1.isEmpty() || !q2.isEmpty()){
            list = new ArrayList<>();
            if(q2.isEmpty()){
                while(!q1.isEmpty()){
                    if(q1.peek().left != null){
                        q2.offer(q1.peek().left);
                        list.add(q1.peek().left.val);
                    }
                    if(q1.peek().right != null){
                        q2.offer(q1.peek().right);
                        list.add(q1.peek().right.val);
                    }
                    q1.poll();
                }
            }else {
                while (!q2.isEmpty()){
                    if(q2.peek().left != null){
                        q1.offer(q2.peek().left);
                        list.add(q2.peek().left.val);
                    }
                    if(q2.peek().right != null){
                        q1.offer(q2.peek().right);
                        list.add(q2.peek().right.val);
                    }
                    q2.poll();
                }
            }
            if(list.size()>0)res.add(list);
        }
        return res;
    }
}
