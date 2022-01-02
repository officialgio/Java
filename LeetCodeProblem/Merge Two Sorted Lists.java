/*

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]



*/


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
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(-1); // implement a prev node to determine where curr should move to
        ListNode curr = prev;
        while(l1 != null && l2 != null) {
             if(l1.val < l2.val) {
                 curr.next = l1; // move curr to next node (l1)
                 l1 = l1.next; // l1 should move to the next node
             } else {
                 curr.next = l2;
                 l2 = l2.next;
             }
            curr = curr.next;  
        }
        curr.next = l1 == null ? l2 : l1; // whichever is not null
        return prev.next;
    }
}
