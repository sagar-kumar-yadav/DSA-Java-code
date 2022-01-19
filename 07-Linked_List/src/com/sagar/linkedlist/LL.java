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
        // create node
        Node node = new Node(value);
        node.next = head;
        head = node;

        // check if tail is null then head assign to null
        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    // insert last
    public void insertLast(int value) {
        // check tail
        // if tail is null insert value using insertFirst Function
        if (tail == null) {
            insertFirst(value);
            return;
        }
        // create a node
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // insert Between
    public void insert(int value, int index) {
        // if node add in first index
        if (index == 0) {
            insertFirst(value);
            return;
        }

        // if node add in last index
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
        // if node add in index first
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        // traverse the node where we reached the index 0
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    // delete first node
    public int deleteFirst() {
        int value = head.value;
        head = head.next;

        // if only one node
        if (head == null){
            tail = null;
        }

        // reduce the size and return value
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

    // delete by index
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

        list.insertFirst(3);
        list.insertFirst(13);
        list.insertFirst(34);
        list.insertFirst(67);
        list.display();

//        list.insertLast(17);
//
//        list.insert(100, 2);
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        list.deleteLast();
//        list.display();
//
//        System.out.println(list.delete(2));
//        list.delete(0);
//        list.display();


        list.insertRec(88, 3);
        list.display();

//
//        list.insertFirst(1);
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(3);
//
//        list.display();
//        list.duplicates();
//        list.display();

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
