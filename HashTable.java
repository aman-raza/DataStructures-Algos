package com.aman.data_structures;

public class HashTable {

    private HashNode[] buckets;
    private int numOfBuckets;  // capacity
    private int size;  // no of key-value pairs in hash table or hash-nodes in hash table

    public HashTable(){
        this(10); // default capacity
    }

    public HashTable(int capacity){
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    private class HashNode{
        private Integer key; // can be generic type
        private String value; // can be generic type
        private HashNode next; // reference to next HashNode

        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }



    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void put(Integer key, String value){

    }

    public String get(Integer key){
        return null;
    }

    public String remove(Integer key){
        return null;
    }

    public static void main(String[] args) {

    }
}
