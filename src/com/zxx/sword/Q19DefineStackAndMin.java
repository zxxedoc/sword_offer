package com.zxx.sword;

import java.util.Stack;

/*
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数
 */
public class Q19DefineStackAndMin {
    public class DefineStackAndMin{
        Stack<Integer> dataStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public void push(int node){
            dataStack.push(node);
            if (minStack.isEmpty() || minStack.peek() > node){
                minStack.push(node);
            }else {
                minStack.push(minStack.peek());
            }
        }

        public void pop() {
            dataStack.pop();
            minStack.pop();
        }

        public int top() {
            return dataStack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
}
