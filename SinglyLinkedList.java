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
//        SinglyLinkedList sll = new SinglyLinkedList();                            // if the function is static no of creating an object of singlyLinkedList.

        // creating nodes
        head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(15);



//
        // connecting all nodes together
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        // calling display function
        display();
        System.out.println(); // for new line



        // calling & printing value of length function
//        System.out.println("The length of the list is : " + length());



        // calling insertFirst function & displaying it by calling display function
//        insertFirst(1);
//        insertFirst(2);
//        insertFirst(3);
//        insertFirst(4);
//        insertFirst(5);
//        display();



        // calling insertFirst function & displaying it by calling display function
//        insertLast(1);
//        insertLast(2);
//        insertLast(3);
//        insertLast(4);
//        insertLast(5);
//        display();


        // calling insert function & displaying it by calling display function
//        insert(1, 10);
//        insert(2, 20);
//        insert(3, 30);
//        insert(1, 11);
//        insert(4, 33);
//        display();
//        System.out.println(); // for new line


        // calling & printing the deleteFirst function data
//        System.out.println(deleteFirst().data + " has been deleted");
//        System.out.print("Now the revamped list is : ");
//        display();


        // calling & printing the deleteLast function data
//        System.out.println(deleteLast().data + " has been deleted");
//        System.out.println("Now the revamped list is : ");
//        display();


        // calling & printing the delete function data
//        System.out.println("Deleting this no : " + delete(3).data);
//        display();


        // calling the find function & printing the result
//        if(find(1)){
//            System.out.println("Search result found !!!");
//        }
//        else{
//            System.out.println("search result not found !!!");
//        }


        // calling the reverse function
//        reverse();
        // for displaying the list we have to make another function which will display the content reversely, where current will start from next and will run till null


        // calling the getMiddleNode function & printing the data
        System.out.println("The middle node is : " + getMiddleNode().data);


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

    // inserting node at the start

    public static void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // inserting node at the end

    public static  void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    // inserting node at a given position

    public static void insert(int position, int value){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    // deleting the first node

    public static ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    // deleting the last node

    public static ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    // deleting a node from a given position

    public static ListNode delete(int position) {
        ListNode current = null;
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            current = previous.next;
            previous.next = current.next;
        }
        return current;
    }

    // searching an element

    public static boolean find(int searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // reversing a singlyLinkedList

    public static void reverse(){
        if(head == null){
            return;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
    }

    // finding the middle node

    public static ListNode getMiddleNode(){
        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
}
