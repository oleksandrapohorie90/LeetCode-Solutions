/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
            // base case
        if (head == null || head.next == null) {
            return false;
        }
        // Floyd's Tortoise and Hare Algorithm
        // Two pointers slow and fast
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true; //they meet cycle exist
            }
             
        }
         return false;
    }
}