package linkedList.leetCode.iterative;

import linkedList.leetCode.SinglyMain.*;

public class MiddleoftheLinkedList876 {

    public ListNode middleNode(ListNode head) {

        ListNode curr = head;
        ListNode next = head;

        while(next != null && next.next != null){
            curr = curr.next;
            next = next.next.next;
        }

        return curr;
    }
}
