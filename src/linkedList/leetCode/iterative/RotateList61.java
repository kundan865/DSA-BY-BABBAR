package linkedList.leetCode.iterative;

import linkedList.leetCode.SinglyMain.*;

public class RotateList61 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode tail = head;
        int count = 1;

        while(tail.next != null){
            count ++;
            tail = tail.next;
        }

        tail.next = head;

        k = k % count;
        int steps = count - k;

        ListNode newTail = head;

        for(int i = 1; i < steps; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
