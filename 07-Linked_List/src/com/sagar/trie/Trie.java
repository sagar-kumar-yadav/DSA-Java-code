package com.sagar.trie;

// https://leetcode.com/problems/implement-trie-prefix-tree/
// 208. Implement Trie (Prefix Tree)



class Trie {
    class Node {
        Node[] childs;
        boolean isEnd;

    }
    Node root;
    public Trie() {
        root = new Node();
        
    }
    
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (curr.childs[ch - 'a'] == null){
                curr.childs[ch - 'a'] = new Node();
            }
            curr = curr.childs[ch- 'a'];

        }
        curr.isEnd = true;
        
    }
    
    public boolean search(String word) {
        
    }
    
    public boolean startsWith(String prefix) {
        
    }
}