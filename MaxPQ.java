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


        // calling the insert method & printing the result
        pq.insert(2);
        pq.insert(3);
        pq.insert(4);
        pq.insert(5);
        pq.insert(6);
        System.out.println(pq.size());
        pq.printMaxHeap();


        System.out.println();  // for new line

        // calling the deleteMax method & printing the result
        pq.deleteMax();
        System.out.println(pq.size());
        pq.printMaxHeap();
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
    
    // delete the max element from a Max Heap
    
    public int deleteMax(){
        int max = heap[1];
        swap(1, n);
        n--;
        sink(1);
        heap[n + 1] = null;
        if(n > 0 && (n == (heap.length - 1)/4)){
            resize(heap.length/2);
        }
        return max;
    }

    private void sink(int k) {
        while(2 * k <= n){
            int j = 2 * k;
            if(j < n && heap[j] < heap[j + 1]){
                j++;
            }
            if(heap[k] >= heap[j]){
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    // printing the Max Heap

    public void printMaxHeap(){
        for(int i = 1; i <= n; i++){
            System.out.print(heap[i] + " ");
        }
    }
}
