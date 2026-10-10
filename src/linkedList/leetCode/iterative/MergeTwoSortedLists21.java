package linkedList.leetCode.iterative;

import linkedList.leetCode.SinglyMain.*;

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode list1,
                                  ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        while (list1 != null && list2 != null){

            if (list1.val <= list2.val){
                ListNode newNode = new ListNode(list1.val);
                temp.next = newNode;
                temp = newNode;

                list1 = list1.next;
            } else {
                ListNode newNode = new ListNode(list2.val);
                temp.next = newNode;
                temp = newNode;

                list2 = list2.next;
            }
        }

        if (list1 != null){
            while (list1 != null){
                ListNode newNode = new ListNode(list1.val);
                temp.next = newNode;
                temp = newNode;

                list1 = list1.next;
            }
        }

        if (list2 != null){
            while (list2 != null){
                ListNode newNode = new ListNode(list2.val);
                temp.next = newNode;
                temp = newNode;

                list2 = list2.next;
            }
        }

        return ans.next;
    }
}
