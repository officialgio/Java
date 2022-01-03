/*

Given the head of a sorted linked list, delete all duplicates 
such that each element appears only once. Return the linked list sorted as well.

Input: head = [1,1,2]
Output: [1,2]


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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current_node = head;
        while(current_node != null && current_node.next != null) {
            if(current_node.next.val == current_node.val) {
                current_node.next = current_node.next.next; // deletion
            } else {
                current_node = current_node.next; 
            }
        }
        return head;  
    }
}


/*
   current_node.val     current_node.next.val       current_node.next.next
            1       ->          1               ->             2


*/
