class Solution {
    public boolean hasCycle(ListNode head) {

        // Slow moves 1 step at a time
        ListNode slow = head;

        // Fast moves 2 steps at a time
        ListNode fast = head;

        // Continue while fast can move forward
        while (fast != null && fast.next != null) {

            slow = slow.next;           // Move slow by 1
            fast = fast.next.next;      // Move fast by 2

            // If they meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached the end, so there is no cycle
        return false;
    }
}