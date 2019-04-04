package com.zxx.sword;

import java.util.HashSet;
/*

 */
public class Q59DeleteDuplicatedNode {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null||pHead.next == null)return pHead;
        HashSet set = new HashSet();
        //遍历记录重复节点
        ListNode head = pHead;
        while (head.next!=null){
            if(head.val ==head.next.val)set.add(head.val);
            head = head.next;
        }
        ListNode fHead = new ListNode(0);
        fHead.next = pHead;
        pHead = fHead;
        while (fHead.next!=null){
            if(set.contains(fHead.next.val)){
                fHead.next = fHead.next.next;
                continue;
            }
            fHead = fHead.next;
        }
        pHead = pHead.next;
        return pHead;
    }
}
