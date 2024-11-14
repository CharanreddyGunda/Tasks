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
//23. Merge k Sorted Lists
public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode node : lists) {
            while(node !=null) {
                list.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(list);
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for(int n : list){
            temp.next = new ListNode(n);
            temp = temp.next;
        }
        return head.next;
    }
}



