package com.zxx.sword;

import com.sun.org.apache.bcel.internal.generic.LNEG;
import com.sun.org.apache.bcel.internal.generic.LSHL;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Q58EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null)return null;
        HashSet<ListNode> set = new HashSet<>();
        ListNode p = pHead;
        while (p != null){
            if(set.contains(p)){
                return p;
            }
            set.add(p);
            p = p.next;
        }
        return null;

    }

}
