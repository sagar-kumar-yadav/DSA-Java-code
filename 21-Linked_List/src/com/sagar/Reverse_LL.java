package com.sagar;

public class Reverse_LL {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // insert last
    public void insertLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head =newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void 
}
