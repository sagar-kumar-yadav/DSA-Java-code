package com.sagar.linkedlist;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    // insert first
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    // insert last
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // insert Between
    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast((value));
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    // delete first node
    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    // delete last node
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    // delete index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size-1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    // find node
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            else {
                node = node.next;
            }
        }
        return null;
    }

    // get Node
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    // Display Node
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // create Node
    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Questions
    // remove duplicate in sorted LL
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
}

class Main {
    public static void main(String[] args) {
        LL list = new LL();

//        list.insertFirst(3);
//        list.insertFirst(13);
//        list.insertFirst(34);
//        list.insertFirst(67);
//        list.insertLast(17);
//
//        list.insert(100, 5);
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        list.deleteLast();
//        list.display();
//
//        System.out.println(list.delete(2));
//        list.display();
//
//        list.insertRec(88, 2);
//        list.display();


        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);

        list.display();
        list.duplicates();
        list.display();

        // doubly linked list
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(7);
//
//        list.insertLast(99);
//
//        list.insert(8, 65);
//
//        list.display();


        // circular linked list
//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(67);
//        list.display();
//
//        list.delete(19);
//
//        list.display();
    }
}
