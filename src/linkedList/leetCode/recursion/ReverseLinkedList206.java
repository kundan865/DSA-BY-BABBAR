package linkedList.leetCode.recursion;

import linkedList.leetCode.SinglyMain.*;

public class ReverseLinkedList206 {

    ListNode solve(ListNode curr, ListNode prev){

        if (curr == null){
            return prev;
        }

        ListNode forward = curr.next;
        curr.next = prev;

        return solve(forward, curr);
    }

    public ListNode reverseList(ListNode head) {

        return solve(head, null);
    }

}
