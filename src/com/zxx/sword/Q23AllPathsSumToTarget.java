package com.zxx.sword;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Q23AllPathsSumToTarget {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null)return res;
        Stack<Integer> stack = new Stack<>();
        findPath(root,target,res,stack);
        return res;
    }

    private void findPath(TreeNode root, int target, ArrayList<ArrayList<Integer>> res, Stack<Integer> stack) {
        stack.push(root.val);
        if (root.left == null && root.right == null){
            if (root.val == target){
                ArrayList<Integer> path = new ArrayList<>();
                for (Integer data : stack){
                    path.add(data);
                }
                res.add(path);
            }
        }
        if (root.left != null){
            findPath(root.left,target-root.val,res,stack);

        }
    }

}
