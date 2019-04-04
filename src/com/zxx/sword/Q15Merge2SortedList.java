package com.zxx.sword;

public class Q15Merge2SortedList {
    public ListNode Merge(ListNode list1,ListNode list2){
        if (list1 == null)return list2;
        if (list2 == null)return list1;
        if(list1.val < list2.val){
            list1.next = Merge(list1.next,list2);
            return list1;
        }else {
            list2.next = Merge(list1,list2.next);
            return list2;
        }

    }
}
