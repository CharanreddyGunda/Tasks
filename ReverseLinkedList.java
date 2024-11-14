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
//92. Reverse Linked List II
public class ReverseLinkedList {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right || head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0,head), prev = dummy;
        for(int i=1 ; i<left ; i++) {
            prev = prev.next;
        }
        // System.out.println("start : "+prev.val);
        ListNode reverseStart = prev.next, current = prev.next.next;
        for(int i=0 ; i<(right-left); i++) {
            ListNode temp = current.next;
            current.next  = reverseStart;
            reverseStart  = current;
            current = temp;
        }
        // System.out.println("end : "+current.val);
        ListNode revEnd = prev.next;
        prev.next = reverseStart;
        revEnd.next = current;
        return dummy.next;
    }
}

//challenges :
//two nodes list and three nodes list with 1 reverse
