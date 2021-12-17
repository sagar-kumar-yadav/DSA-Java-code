package com.sagar.linkedlist;

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

    // reverse
    public void reverseList(){
        if (head == null || head.next == null){
            return;
        }
        Node currNode = head;
        Node prevNode = null;
        while (currNode != null){
            Node temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        return prevNode;
/*
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;*/
    }

    // print list
    public void printList(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Reverse_LL list = new Reverse_LL();
        list.insertLast(1);
        list.printList();

        list.insertLast(2);
        list.printList();

        list.insertLast(3);
        list.printList();

        list.reverseList();
        list.printList();
    }

}
