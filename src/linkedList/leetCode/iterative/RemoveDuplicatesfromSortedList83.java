package linkedList.leetCode.iterative;

import linkedList.leetCode.SinglyMain.*;

public class RemoveDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        ListNode newNode = new ListNode(slow.val);
        temp.next = newNode;
        temp = newNode;

        while (fast != null) {

            if (slow.val == fast.val) {
                fast = fast.next;
            } else {

                slow = fast;

                newNode = new ListNode(slow.val);
                temp.next = newNode;
                temp = newNode;

                fast = fast.next;
            }
        }

        return ans.next;
    }
}
