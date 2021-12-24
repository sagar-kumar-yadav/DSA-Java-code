package com.company;

import java.util.Scanner;

// create a node class
class Node {
    int data;
    Node left;
    Node right;
}

// create a bst class
class BST{

    // create new node here
    public Node createNewNode(int k){
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    // insert the element
    public Node insert(Node node, int val){

        // if node is null create new node
        if (node == null){
            return createNewNode(val);
        }

        if (val < node.data){
            node.left = insert(node.left, val);
        }
        else  if (val > node.data){
            node.right = insert(node.right, val);
        }

        return node;
    }

    // delete the element
    // case 1. The node is a leaf node
    // case 2. The node is a non leaf node
        // step 1. replace with inorder pre
        // step 2. replace with inorder post
    // case 3. The node is the root node/ node in b/w bst

    public Node delete(Node node, int val){

        // if node is null return null
        if (node == null){
            return null;
        }

        if (val < node.data){
            node.left = delete(node.left, val);
        }
        else if (val > node.data){
            node.right = delete(node.right, val);
        }

        else {
            if (node.left == null || node.right == null){
                Node temp = null;
                if (node.left != null) {
                    temp = node.left;
                }
                else {
                    temp = node.right;
                }
            }
            else {
                Node Successor = getSuccessor(node);
                node.data = Successor.data;
                node.right = delete(node.right, 4);
            }
        }
        return node;
    }

    private Node getSuccessor(Node node) {
        if (node == null){
            return null;
        }

    }
}

public class BinarySearchTree {
    public static void main(String[] args){
        BST a = new BST();
        Node root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 5);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 15);

    }
}

