package linkedList.leetCode.iterative;

import linkedList.leetCode.SinglyMain.*;

public class MergeNodesinBetweenZeros2181 {
    public ListNode mergeNodes(ListNode head) {

        head = head.next;

        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        int sum = 0;

        while(head != null){

            if (head.val == 0){

                ListNode newNode = new ListNode(sum);
                temp.next = newNode;
                temp = newNode;

                sum = 0;
            } else {
                sum += head.val;

            }
            head = head.next;
        }

        return ans.next;
    }
}
