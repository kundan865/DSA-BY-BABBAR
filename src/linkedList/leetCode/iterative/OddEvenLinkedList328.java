package linkedList.leetCode.iterative;

import linkedList.leetCode.SinglyMain.*;

public class OddEvenLinkedList328 {
    public ListNode oddEvenList1(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        int count = 1;

        ListNode odd = new ListNode(0);
        ListNode temp1 = odd;

        ListNode even = new ListNode(0);
        ListNode temp2 = even;

        while (head != null){

            ListNode newNode = new ListNode(head.val);

            if (count % 2 == 0){

                temp2.next = newNode;
                temp2 = newNode;

            } else {

                temp1.next = newNode;
                temp1 = newNode;
            }
            head = head.next;
            count ++;
        }

        odd = odd.next;
        even = even.next;

        temp1.next = even;

        return odd;
    }

    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
}
