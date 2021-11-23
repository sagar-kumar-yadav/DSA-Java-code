package com.sagar;

// https://www.hackerrank.com/challenges/30-linked-list/problem?isFullScreen=false
// Day 15: Linked List

import java.util.Scanner;

public class day15 {

    // create node
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // insert data
    public void insert(int data){
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
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
    }

    // main
    public static void main(String[] args) {
        day15 list = new day15();
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int num = sc.nextInt();
            list.insert(num);
        }
        list.printList();
    }
}
