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
    public void reorderList(ListNode head) {

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is now at the middle
        // Example: 1 -> 2 -> 3 -> 4 -> 5
        //                  ↑
        //                 slow

        // Step 2: Reverse the second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // prev is the head of reversed second half
        // Example: 4 -> 5 becomes 5 -> 4

        // Step 3: Merge the two halves alternately
        ListNode first = head;
        ListNode second = prev;

        while (second.next != null) {

            // Save next nodes before changing links
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            // Connect first -> second
            first.next = second;

            // Connect second -> next first
            second.next = firstNext;

            // Move both pointers forward
            first = firstNext;
            second = secondNext;
        }
    }
}
