package com.sagar.linkedlist;

public class DLL {
    private Node head;

    // insert first node
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if (head != null){
            head.prev = node;
        }
        head = node;

    }

    // display
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value +" -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");
    }

    // display reverse


    // create node
    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

