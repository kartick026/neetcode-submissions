class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node = starting point of our answer list
        ListNode dummy = new ListNode(0);

        // curr will be used to build the merged list
        ListNode curr = dummy;

        // Continue until one of the lists becomes empty
        while (list1 != null && list2 != null) {

            // Compare the current nodes of both lists
            if (list1.val <= list2.val) {

                // list1 value is smaller, so attach list1 node
                curr.next = list1;

                // Move list1 to its next node
                list1 = list1.next;

            } else {

                // list2 value is smaller, so attach list2 node
                curr.next = list2;

                // Move list2 to its next node
                list2 = list2.next;
            }

            // Move curr to the node we just attached
            curr = curr.next;
        }

        // One list is finished.
        // Attach whatever is remaining in the other list.
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        // dummy itself is not part of the answer,
        // so return the node after dummy
        return dummy.next;
    }
}