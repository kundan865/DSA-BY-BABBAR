package linkedList.circularLinkedList;

public class DoublyCircularLinkedList {

    static class Node{
        Node prev;
        int val;
        Node next;

        Node(int val){
            this.prev = null;
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    DoublyCircularLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    void print(){

        Node temp = head;

        do {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        while (temp != head);

        System.out.println();
    }

    void printCircular(){

        Node temp = head;

        do {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        while (temp != null);

        System.out.println();
    }

    void insertAtHead(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.prev = head;
            tail.next = head;
            tail.prev = head;

        } else {

            newNode.next = head;
            newNode.prev = tail;

            head.prev = newNode;
            tail.next = newNode;

            head = newNode;
        }

        size++;
    }

    void insertAtTail(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.prev = head;
            tail.next = head;
            tail.prev = head;

        } else {

            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            head.prev = newNode;

            tail = newNode;
        }

        size++;
    }

    void insertAtPosition(int position, int val) {

        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            insertAtHead(val);
            return;
        }

        if (position == size) {
            insertAtTail(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        Node prevNode = temp;
        Node currNode = new Node(val);
        Node nextNode = temp.next;

        prevNode.next = currNode;
        currNode.prev = prevNode;

        currNode.next = nextNode;
        nextNode.prev = currNode;

        size++;
    }

    int getSize(){
        return size;
    }

    int searchAnElement(int target){

        if (head == tail){
            return 0;
        }

        int index = -1;
        Node temp = head;

        do {
            index ++;
            if (temp.val == target){
                return index;
            }

            temp = temp.next;
        } while (temp != head);

        return -1;
    }

    void updateAnElement(int before, int after){

        Node temp = head;

        do {
            if (temp.val == before){
                temp.val = after;
                return;
            }

            temp = temp.next;
        } while (temp != head);
    }

    void deleteHead(){

        if (head == tail){
            head = null;
            tail = null;

        } else {

            head = head.next;
            head.prev = tail;

            tail.next = head;
        }

        size --;
    }
    void deleteTail(){

        if (head == tail){
            head = null;
            tail = null;

        } else {

            Node prevNode = tail.prev;
            prevNode.next = head;
            head.prev = tail;

            tail = prevNode;
        }
        size --;
    }

    void deletePosition(int position){

        if (position < 0 || position >= size){
            System.out.println("invalid position");
            return;
        }

        if (position == 0){
            deleteHead();
            return;
        }

        if (position == size - 1){
            deleteTail();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position; i++){
            temp = temp.next;
        }

        Node prevNode = temp;
        Node nextNode = temp.next.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        size --;
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        list.insertAtHead(5);
        list.insertAtHead(4);
        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtHead(1);

        list.insertAtTail(6);
        list.insertAtTail(7);
        list.insertAtTail(8);
        list.insertAtTail(9);
        list.insertAtTail(10);

        list.print();

        list.deletePosition(9);

        list.print();

    }
}
