package com.aman.data_structures;

public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode(); // root is empty
    }

    private class TrieNode{
        private TrieNode[] children;
        private boolean isWord;

        public TrieNode(){
            this.children = new TrieNode[26];  // storing letters : a -- > z
            this.isWord = false;
        }
    }

    public static void main(String[] args) {

    }
}
