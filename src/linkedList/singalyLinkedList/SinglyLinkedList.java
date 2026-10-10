package linkedList.singalyLinkedList;

public class SinglyLinkedList {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head ;
    private Node tail;
    private int size;

    SinglyLinkedList(){
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

    void insertAtHead(int val){

        Node newNode = new Node(val);

        if (head == null && tail == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void insertAtTail(int val){

        Node newNode = new Node(val);

        if (head == null && tail == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void insertAtPosition(int position, int val){

        Node newNode = new Node(val);

        if (position == 1) {

            newNode.next = head;
            head = newNode;

            if (tail == null) {
                tail = newNode;
            }

            size++;
            return;
        }

        Node curr = head;

        for (int i = 1; i < position - 1; i++) {
            curr = curr.next;
        }

        // Insert new node
        newNode.next = curr.next;
        curr.next = newNode;

        // If inserted at the end, update tail
        if (newNode.next == null) {
            tail = newNode;
        }

        size++;

    }
    int getLength(){
        int length = 0;

        Node temp = head;

        while(temp!=null){
            length ++;
            temp = temp.next;
        }
        return length;
    }
    boolean searAnElement(int element){

        Node temp = head;

        while (temp != null){
            if(temp.val == element){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    void updateValue(int before, int after){

        Node temp = head;

        while (temp != null){
            if (temp.val == before){
                temp.val = after;
            }
            temp = temp.next;
        }

    }
    void deleteHead(){
        if (head == null) {
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    void deleteTail() {

        if (head == null) {
            return;
        }

        // Only one node
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }
    void deleteAtPosition(int position) {

        if (head == null) {
            return;
        }

        // Delete head
        if (position == 1) {
            deleteHead();
            return;
        }

        Node temp = head;

        // Reach node before the position
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        // Delete node
        if (temp.next == null) {
            return;
        }

        // If deleting tail
        if (temp.next == tail) {
            deleteTail();
            return;
        }

        temp.next = temp.next.next;
        size--;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);


        list.insertAtTail(10);
        list.insertAtTail(11);


        list.insertAtPosition(4,100);

        list.insertAtPosition(6,200);
        list.print();

//        System.out.println("length = "+ list.getLength());

//        System.out.println("search = "+list.searAnElement(1000));

        list.updateValue(200,300);
        list.print();

        list.deleteTail();
        list.print();


    }
}
