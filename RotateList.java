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
//61. Rotate List
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null || head.next == null) {
            return head;
        }

        int count = 1;
        ListNode temp = head;
        while(temp.next!=null) {
            count++;
            temp = temp.next;
        }
        temp.next = head;
        k = k%count;
        count = count-k;
        while(count-->0) {
            temp = temp.next;
        }
        System.out.println(temp.next.val);
        head = temp.next;
        temp.next = null;
        return head;
    }
}



