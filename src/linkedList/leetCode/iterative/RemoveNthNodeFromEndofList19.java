package linkedList.leetCode.iterative;

import linkedList.leetCode.SinglyMain.*;

public class RemoveNthNodeFromEndofList19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return null;
        }
        if(n == 0){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++){
            if(fast == null){
                return null;
            }

            fast = fast.next;
        }
        if (fast == null){
            return head.next;
        }

        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
