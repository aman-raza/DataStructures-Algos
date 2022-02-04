package com.aman.data_structures;

public class MaxPQ {   // Max Priority Queue

    private Integer[] heap;
    private int n;  // size of max heap

    public MaxPQ(int capacity){
        heap = new Integer[capacity + 1];  // index 0 is kept as empty
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public static void main(String[] args) {
        MaxPQ pq = new MaxPQ(3);
        System.out.println(pq.size());  // 0
        System.out.println(pq.isEmpty());  // true
    }
}
