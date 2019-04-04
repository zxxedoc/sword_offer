package com.zxx.sword;

import java.util.ArrayList;
import java.util.Stack;
/*
逆序打印链表，借助栈
 */
public class Q03PrintLinkListRev {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<ListNode> stack = new Stack<ListNode>();
        while(listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop().val);
        }
        return list;
    }
}


