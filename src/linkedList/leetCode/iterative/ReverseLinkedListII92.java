package linkedList.leetCode.iterative;

import linkedList.leetCode.SinglyMain.*;

public class ReverseLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for (int i = 1; i < left; i++){
            prev = prev.next;
        }

        ListNode curr = prev.next;

        System.out.println();

        for (int i = 0; i < right - left; i++){

            ListNode forward = curr.next;

            curr.next = forward.next;
            forward.next = prev.next;
            prev.next = forward;

        }

        return dummy.next;
    }
}
