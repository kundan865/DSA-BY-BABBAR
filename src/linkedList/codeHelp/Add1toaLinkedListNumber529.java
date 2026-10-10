package linkedList.codeHelp;

import linkedList.leetCode.SinglyMain.*;

import java.util.List;

public class Add1toaLinkedListNumber529 {
    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public ListNode plusOne(ListNode head) {

        ListNode reverse = reverse(head);

        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        int carry = 1;

        while (reverse != null) {

            int sum = reverse.val + carry;

            int rem = sum % 10;
            carry = sum / 10;
            
            ListNode newNode = new ListNode(rem);
            temp.next = newNode;
            temp = newNode;

            reverse = reverse.next;
        }

        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
        }

        return reverse(ans.next);
    }
}
