package linkedList.leetCode;

import linkedList.leetCode.iterative.*;

public class SinglyMain {
    public static class ListNode {

        public int val;
        public ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }

    }

    private static ListNode head;
    private static ListNode tail;

    SinglyMain(){
        head = null;
        tail = null;
    }
    void insertTail(int val){

        ListNode newNode = new ListNode(val);

        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void print(){
        ListNode temp = head;

        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void print(ListNode temp){

        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyMain list = new SinglyMain();

        list.insertTail(1);
        list.insertTail(2);
        list.insertTail(3);
        list.insertTail(4);
        list.insertTail(5);

        list.insertTail(6);
        list.insertTail(20);
        list.insertTail(11);
        list.insertTail(9);
        list.insertTail(10);

        list.print();

        SortList148 list148 = new SortList148();
        ListNode ans = list148.sortList(head);
        list.print(ans);
    }

}
