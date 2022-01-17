package com.aman.data_structures;

public class SinglyLinkedList {

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static ListNode head;


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        // creating nodes

//        head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);
//
//        // connecting all nodes together
//
//        head.next = second;
//        second.next = third;
//        third.next = fourth;

        // calling display function
        display();
        System.out.println(); // for new line

        // calling & printing value of length function
        System.out.println("The length of the list is : " + length());

        // calling insertFirst function & displaying it by calling display function
        insertFirst(1);
        insertFirst(2);
        insertFirst(3);
        insertFirst(4);
        insertFirst(5);
        display();


    }

    // display method

    public static void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print("null");
    }

    // length of list

    public static int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // inserting a node

    public static void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
}
