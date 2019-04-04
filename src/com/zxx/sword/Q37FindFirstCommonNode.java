package com.zxx.sword;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Q37FindFirstCommonNode {
    int len1 = 0, len2 = 0;

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {


        while (pHead1 != null) {
            while(pHead2 != null){
                if(pHead1 == pHead2){
                    return pHead1;
                }else{
                    pHead2 = pHead2.next;
                }
            }
            pHead1 = pHead1.next;
        }
        return pHead1;
    }

}
