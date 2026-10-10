package linkedList.codeHelp;

import linkedList.leetCode.SinglyMain.*;

public class PrintKthNodeFromtheEndofaLinkedList289 {
    public int kthNodeFromEnd(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast =head;

        for(int i = 0; i < k; i++){
            if(fast == null) {
                return -1;
            }

            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow.val;
    }
}
