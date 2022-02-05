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
//        System.out.println(pq.size());  // 0
//        System.out.println(pq.isEmpty());  // true

        pq.insert(2);
        pq.insert(3);
        pq.insert(4);
        pq.insert(5);
        System.out.println(pq.size());
    }

    // insert in a Max Heap

    public void insert(int x){
        if(n == heap.length - 1){
            resize(2 * heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    private void swim(int k){
        while(k > 1 && heap[k/2] < heap[k]){
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2;  // to continue shifting up till new value inserted reaches to its correct position
        }
    }

    private void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for(int i = 0; i < heap.length; i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }
}
