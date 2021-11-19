package com.sagar;

public class LL {
    // create node
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // insert first
    public void insertFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // insert last
    public void insertLast(String data){
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

    // print
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
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if (head == null){
            System.out.println("the list is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst("a");
        list.insertFirst("is");
        list.printList();

        list.insertLast("list");
        list.printList();

        list.insertFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

    }
}
