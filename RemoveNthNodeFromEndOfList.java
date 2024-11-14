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
//19. Remove Nth Node From End of List
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }
        int count = 0;
        ListNode dummy = head;
        while(dummy != null) {
            count++;
            dummy = dummy.next;
        }
        count = count-n;
        if(count == 0) {
            return head.next;
        }
        dummy = head;
        int dummyCount = 0;
        while(dummy != null) {
            if(dummyCount == (count-1)) {
                System.out.println(dummy.val);
                if(dummy.next.next != null){
                    dummy.next = dummy.next.next;
                }
                else{
                    dummy.next = null;
                }
                return head;
            }
            else{
                dummy = dummy.next;
                dummyCount++;
            }
        }
        return head;
    }
        
}

