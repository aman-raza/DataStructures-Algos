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
        if(key == null || value == null){
            throw new IllegalArgumentException("Key or Value is null !!!");
        }

        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);  // (key, value) -> null
        node.next = head;
        buckets[bucketIndex] = node;
    }

    public String get(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null !!!");
        }

        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    private int getBucketIndex(Integer key){
        return key % numOfBuckets;
    }

    public String remove(Integer key){
        return null;
    }

    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(105, "Tom");
        table.put(21, "Sana");
        table.put(21, "Harry"); // now Sana got replaced by Harry
        table.put(31, "Dinesh"); // this will get added by the next to Harry
        System.out.println(table.size());
        System.out.println(table.get(31));
    }
}
