package com.zxx.sword;

import java.util.Stack;

/*
判断一个出栈序列是否属于给定的入栈序列
 */
public class Q20IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0,j = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[j] && j < popA.length){
                stack.pop();
                j++;
            }
        }
        if (stack.isEmpty())return true;
        else return false;
    }
}
