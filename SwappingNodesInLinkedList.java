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
//1721. Swapping Nodes in a Linked List
public class SwappingNodesInLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = null, right = null, temp  = head;
        int count = 1;
        while(temp != null) {
            if(count == k){
                left = temp;
            }   
            count++;
            temp = temp.next;
        }
        temp = head;
        count = count-k;
        while(count-- >1) {
            temp = temp.next;
        }
        right = temp;
        System.out.println(left.val);
        System.out.println(right.val);
        int val = left.val;
        left.val = right.val;
        right.val = val;
        return head;
    }
}

