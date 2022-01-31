package com.aman.data_structures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueUtil {

    private ListNode front;
    private ListNode rear;
    private int length;

    public QueueUtil(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }



    public static void main(String[] args) {
        QueueUtil queue = new QueueUtil();

        // enqueue operation
        queue.enqueue(10);
        queue.enqueue(20);
        queue.print();


        // dequeue operation
        queue.dequeue();
        queue.print();


        // calling generateBinaryNumbers & displaying the result
        String[] output = queue.generateBinaryNumbers(4);
        System.out.println(Arrays.toString(output));
    }



    // enqueue operation (adding data in the queue)
    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }
        else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    // printing the data in the queue
    public void print(){
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    // dequeue operation (removing data from the queue)
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }

        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }

    // generate binary numbers from 1 to n
    public String[] generateBinaryNumbers(int n){
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i = 0; i < n; i++){
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
}
