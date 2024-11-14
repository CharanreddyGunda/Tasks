package com.tekworks.day_4;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//24. Swap Nodes in Pairs
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = head;
        while(dummyHead != null) {
            int temp = dummyHead.val;
            ;
            if(dummyHead.next !=null) {
                ListNode node = dummyHead.next;
                dummyHead.val = node.val;
                node.val = temp;
                dummyHead = node.next;
            }
            else{
                return head;
            }
            
        }
        return head;
    }
}