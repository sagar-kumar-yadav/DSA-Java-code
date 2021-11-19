package com.sagar;

public class LL1 {
    // create node
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //insert first
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //insert last
    public void insertLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print
    public void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;

    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(8);
        list.printList();

        list.deleteFirst();
        list.printList();
    }
}
