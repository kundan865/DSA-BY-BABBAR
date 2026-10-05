package linkedList.circularLinkedList;

public class CircularSinglyLinkedList {

    static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    CircularSinglyLinkedList(){
        this.head  = null;
        this.tail = null;
        this.size = 0;
    }

    void print() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    void insertAtHead(int val){

        Node newNode = new Node(val);

        if (head == null && tail == null){
            head = newNode;
            tail = newNode;

            tail.next = head;
        } else {

            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }

        size++;
    }

    void insertAtTail(int val){

        Node newNode = new Node(val);

        if (head == null && tail == null){

            head = newNode;
            tail = newNode;

            tail.next = head;
        } else {

            tail.next = newNode;
            tail = newNode;

            tail.next = head;
        }

        size++;
    }

    void insertAtPosition(int position, int val){

        if (position < 0 || position > size){
            System.out.println("Invalid position");
            return;
        }

        if (position == 0){
            insertAtHead(val);
            return;
        }

        if (position == size){
            insertAtTail(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position; i++){

            temp = temp.next;
        }

        Node prevNode = temp;
        Node currNode = new Node(val);
        Node nextNode = temp.next;

        prevNode.next = currNode;

        currNode.next = nextNode;

        size++;
    }

    int getSize(){
        return size;
    }

    int searchAnElement(int target){

        if (head == null && tail == null){
            System.out.println("This linked list is empty..");
            return -1;
        }

        Node temp = head;
        int index = -1;

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

        if (head == null && tail == null){
            System.out.println("This linked list is empty..");
        }

        Node temp = head;

        do {

            if (temp.val == before){
                temp.val = after;
            }

            temp = temp.next;

        } while (temp != head);
    }

    void deleteHead(){

        if (head == null && tail == null){
            System.out.println("This linked list is empty..");
            return;
        }

        if (head == tail){

            head = null;
            tail = null;

        } else {

            head = head.next;
            tail.next = head;
        }
        size--;
    }

    void deleteTail(){

        if (head == null && tail == null){
            System.out.println("This linked list is empty..");
            return;
        }

        if (head == tail){

            head = null;
            tail = null;

        } else {

            Node temp = head;

            do {
                temp = temp.next;
            } while (temp.next.next != head);

            temp.next = head;
            tail = temp;
        }

        size--;
    }

    void deletePosition(int position){

        if (position < 0 || position >= size){
            System.out.println("Invalid position");
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

    }

    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

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


        list.deletePosition(5);


        list.print();


    }
}
