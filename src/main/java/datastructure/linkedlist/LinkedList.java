package datastructure.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public int size() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (size == 0) tail = newNode;
        size++;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
//        tail.next = newNode;    //(size==0 일때 tail자체가 null임 때문에 NullPointerException)
        if (size == 0) head = newNode;
        else tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void add(int idx, String data) {
        if (idx == 0) addFirst(data);
        else if (idx == size) addLast(data);
        else {
            Node newNode = new Node(data);
            Node beforeNode = getNode(idx - 1);
            newNode.next = beforeNode.next;
            beforeNode.next = newNode;
        }
        size++;
    }

    public Node getNode(int idx) {
        if (idx >= size || idx < 0) throw new IndexOutOfBoundsException();
        Node element = head;
        for (int i = 0; i < idx; i++) {
            element = element.next;
        }
        return element;
    }

    public String get(int idx) {
        return getNode(idx).data;
    }

    public void deleteFirst() {
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
    }

    public void deleteLast() {
        if (size <= 1) tail = null;
        else {
            Node beforeNode = getNode(size - 2);
            tail = beforeNode;
            beforeNode.next = null;
        }
        size--;
    }

    public class Node {
        private String data;
        private Node next;

        Node(String data) {
            this.data = data;
        }

        String getData() {
            return data;
        }

        Node getNext() {
            return next;
        }
    }
}
