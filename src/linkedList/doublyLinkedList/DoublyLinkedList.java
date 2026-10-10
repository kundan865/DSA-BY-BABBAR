package linkedList.doublyLinkedList;

public class DoublyLinkedList {

    static class Node {
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

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void printReverse(){

        Node temp = tail;

        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insertAtHead(int val){

        Node newNode = new Node(val);

        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void insertAtTail(int val){

        Node newNode = new Node(val);

        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
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

        // Reach the node currently at 'position'
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

    int getLength(){
        return size;
    }

    int searchAnElement(int val){

        if (head == null && tail == null){
            System.out.println("This Linked List is Empty..");
            return -1;
        }

        else {

            Node temp = head;
            int index = -1;

            while (temp != null){

                index ++;
                if (temp.val == val){
                    return index;
                }

                temp = temp.next;
            }
        }
        return -1;
    }

    void updateElement(int before, int after) {

        if (head == null && tail == null) {
            System.out.println("This Linked List is Empty..");
            return ;
        }

        Node temp = head;

        while (temp != null){

            if(temp.val == before){
                temp.val = after;
                return;
            }

            temp = temp.next;
        }
    }

    void deleteHead(){

        if (head == null && tail == null){
            System.out.println("This Linked List is Empty...");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size --;
    }

    void deleteTail(){

        if (head == null && tail == null){
            System.out.println("This Linked List is Empty...");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size --;
    }

    void deleteAtPosition(int position) {

        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            deleteHead();
            return;
        }

        if (position == size - 1) {
            deleteTail();
            return;
        }

        Node temp = head;

        // Reach the node currently at 'position'
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        Node prevNode = temp;
        Node nextNode = temp.next.next;

        System.out.println("prev node = "+prevNode.val);
        System.out.println("next node = "+nextNode.val);

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        size--;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

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

//        int ans = list.sreachAnElement(8);
//        System.out.println("ans = "+ans);

//        list.updateElement(10,100);

        list.print();
        list.printReverse();

    }
}
