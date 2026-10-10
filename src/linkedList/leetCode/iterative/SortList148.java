package linkedList.leetCode.iterative;

import linkedList.leetCode.SinglyMain.*;

public class SortList148 {

    private void print(ListNode head, ListNode tail){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.print("  st  ");

        temp = tail;

        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        print(head, slow);

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right){

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (left != null && right != null){

            if (left.val <= right.val){
                ListNode newNode = new ListNode(left.val);
                temp.next = newNode;
                temp = newNode;

                left = left.next;
            } else {
                ListNode newNode = new ListNode(right.val);
                temp.next = newNode;
                temp = newNode;

                right = right.next;
            }
        }

        if (left != null){
            while (left != null){
                ListNode newNode = new ListNode(left.val);
                temp.next = newNode;
                temp = newNode;

                left = left.next;
            }
        }

        if (right != null){
            while (right != null){
                ListNode newNode = new ListNode(right.val);
                temp.next = newNode;
                temp = newNode;

                right = right.next;
            }
        }
        return dummy.next;
    }
}
