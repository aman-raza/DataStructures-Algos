package com.aman.data_structures;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }


    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last =fourth;
    }



    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//        csll.createCircularLinkedList();

        // calling the display method
//        csll.display();


        // calling insertFirst method & displaying the result
//        csll.insertFirst(0);
//        csll.insertFirst(10);
//        csll.insertFirst(20);
//        csll.display();


        // calling insertLast method & displaying the result
        csll.insertLast(0);
        csll.insertLast(10);
        csll.insertLast(15);
        csll.display();


        // calling removeFirst method & printing the result
        csll.removeFirst();
        csll.display();
    }



    // display the list

    public void display(){
        if(last == null){
            return;
        }

        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    // insert node at the start

    public void insertFirst(int data){
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
        }
        else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    // insert node at the end

    public void insertLast(int data){
        ListNode temp = new ListNode(data);

        if(last == null){ // isEmpty()
            last = temp;
            last.next = last;
        }
        else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    // remove the first node from the list

    public ListNode removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("Circular Singly Linked List is Empty");
        }

        ListNode temp = last.next;
        if(last.next == last){
            last = null;
        }
        else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }
}
