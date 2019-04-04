package com.zxx.sword;

import java.util.LinkedList;

/**
 * 反转链表
 */
public class Q14ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head == null)return null;
        ListNode pre = null,next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
