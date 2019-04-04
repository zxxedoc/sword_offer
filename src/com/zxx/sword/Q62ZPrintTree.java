package com.zxx.sword;

import java.util.ArrayList;
import java.util.Stack;

public class Q62ZPrintTree {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null)return res;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        s1.push(pRoot);
        list.add(pRoot.val);
        res.add(list);

        while(!s1.isEmpty() || !s2.isEmpty()){
            list = new ArrayList<>();
            if(s2.isEmpty()){
                while (!s1.isEmpty()){
                    if(s1.peek().right != null){
                        list.add(s1.peek().right.val);
                        s2.push(s1.peek().right);
                    }
                    if(s1.peek().left != null){
                        list.add(s1.peek().left.val);
                        s2.push(s1.peek().left);
                    }
                    s1.pop();
                }
            }else {
                while(!s2.isEmpty()){
                    if(s2.peek().left != null){
                        list.add(s2.peek().left.val);
                        s1.push(s2.peek().left);
                    }
                    if(s2.peek().right != null){
                        list.add(s2.peek().right.val);
                        s1.push(s2.peek().right);
                    }
                    s2.pop();
                }
            }
            if(list.size()>0)res.add(list);
        }
        return res;
    }

}
