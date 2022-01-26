package com.aman.data_structures;

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



    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//        csll.createCircularLinkedList();

        // calling the display method
//        csll.display();


        // calling insertFirst method & displaying the result
        csll.insertFirst(0);
        csll.insertFirst(10);
        csll.insertFirst(20);
        csll.display();
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
}
