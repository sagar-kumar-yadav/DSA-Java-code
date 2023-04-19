package com.company;

public class Main {

    // Node class for defining the structure of each node in the BST
    public static class Node {
        int data;
        Node left;
        Node right;


        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = null;
            this.right = right;
        }
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
    }
}
