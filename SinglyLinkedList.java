package com.aman.data_structures;

import java.util.List;

public class SinglyLinkedList {

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private ListNode head;


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();                            // if the function is static no need of creating an object of singlyLinkedList.

        // creating nodes
//        sll.head = new ListNode(1);
//        ListNode second = new ListNode(5);
//        ListNode third = new ListNode(6);
//        ListNode fourth = new ListNode(13);
//        ListNode fifth = new ListNode(15);



//
        // connecting all nodes together
//        sll.head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = fifth;


        // calling display function
//        sll.display();
//        System.out.println(); // for new line



        // calling & printing value of length function
//        System.out.println("The length of the list is : " + sll.length());



        // calling insertFirst function & displaying it by calling display function
//        sll.insertFirst(1);
//        sll.insertFirst(2);
//        sll.insertFirst(3);
//        sll.insertFirst(4);
//        sll.insertFirst(5);
//        sll.display();



        // calling insertLast function & displaying it by calling display function
//        sll.insertLast(1);
//        sll.insertLast(2);
//        sll.insertLast(3);
//        sll.insertLast(4);
//        sll.insertLast(5);
//        sll.display();


        // calling insert function & displaying it by calling display function
//        sll.insert(1, 10);
//        sll.insert(2, 20);
//        sll.insert(3, 30);
//        sll.insert(1, 11);
//        sll.insert(4, 33);
//        sll.display();
//        System.out.println(); // for new line


        // calling & printing the deleteFirst function data
//        System.out.println(sll.deleteFirst().data + " has been deleted");
//        System.out.print("Now the revamped list is : ");
//        sll.display();


        // calling & printing the deleteLast function data
//        System.out.println(sll.deleteLast().data + " has been deleted");
//        System.out.println("Now the revamped list is : ");
//        sll.display();


        // calling & printing the delete function data
//        System.out.println("Deleting this no : " + sll.delete(3).data);
//        sll.display();


        // calling the find function & printing the result
//        if(sll.find(1)){
//            System.out.println("Search result found !!!");
//        }
//        else{
//            System.out.println("search result not found !!!");
//        }


        // calling the reverse function
//        sll.reverse();
        // for displaying the list we have to make another function which will display the content reversely, where current will start from next and will run till null


        // calling the getMiddleNode function & printing the data
//        System.out.println("The middle node is : " + sll.getMiddleNode().data);


        // calling the getNthNodeFromTheEnd function & printing the data
//        System.out.println("Nth node from the end is : " + sll.getNthNodeFromTheEnd(2).data);


        // calling removeDuplicates function & printing the result
//        sll.removeDuplicates();
//        sll.display();


        // calling insertInSortedList function & printing the data
//        sll.insertInSortedList(7);
//        sll.display();


        // calling deleteNode function & displaying the data
//        sll.deleteNode(13);
//        sll.display();


        // calling createALoopInALinkedList function to create a loop
//        sll.createALoopInLinkedList();


        // calling containsLoop function to check if it contains or nor
//        System.out.println(sll.containLoop());


        // calling startNodeInALoop function & printing its data
//        System.out.println(sll.startNodeInALoop().data);


        // calling removeLoop & displaying the list without the loop
//        sll.removeLoop();
//        sll.display();



        // creating list a
        SinglyLinkedList a = new SinglyLinkedList();
        a.insertLast(7);
        a.insertLast(4);
        a.insertLast(9);
        a.display();
        System.out.println();

        // creating list b
        SinglyLinkedList b = new SinglyLinkedList();
        b.insertLast(5);
        b.insertLast(6);
        b.display();
        System.out.println();


        //creating the result list & calling merge function & displaying the list
//        SinglyLinkedList result = new SinglyLinkedList();
//        result.head = merge(a.head, b.head);
//        result.display();


        // calling add function & displaying the result
        SinglyLinkedList sum = new SinglyLinkedList();
        sum.head = add(a.head, b.head);
        sum.display();

    }

    // display method

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print("null");
    }

    // length of list

    public int length() {
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

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // inserting node at the end

    public void insertLast(int value){
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

    public void insert(int position, int value){
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

    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    // deleting the last node

    public ListNode deleteLast(){
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

    public ListNode delete(int position) {
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

    public boolean find(int searchKey){
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

    public void reverse(){
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

    public ListNode getMiddleNode(){
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

    // finding the nth node from the end of the list

    public ListNode getNthNodeFromTheEnd(int n){
        if(head == null){
            return null;
        }

        if(n <= 0){
            throw new IllegalArgumentException("Invalid value : n = " + n);
        }

        ListNode mainPtr = head;
        ListNode refPtr = head;

        int count = 0;

        while(count < n){
            if(refPtr == null){
                throw new IllegalArgumentException(n + " is greater than the number of nodes in the list.");
            }
            refPtr = refPtr.next;
            count++;
        }

        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    // removing the duplicate from the sorted list

    public void removeDuplicates(){
        if(head == null){
            return;
        }

        ListNode current = head;

        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }

    // inserting a node in a sorted list

    public ListNode insertInSortedList(int value){
        ListNode newNode = new ListNode(value);

        if(head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    // remove a given key from the list

    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;

        if(current != null && current.data == key){
            head = current.next;
            return;
        }

        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }

        if(current == null){
            return;
        }
        temp.next = current.next;
    }

    // creating a loop in the list

    public void createALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    // detect a loop in the list

    public boolean containLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }


    // FLOYD'S CYCLE DETECTION ALGORITHM : START



    // startNodeInALoop // for getting into the loop and then calling the getStartingNode function

    public ListNode startNodeInALoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    // finding start of a loop after getting into the loop from the previous function

    private ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;

        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;  // this temp is the starting node of the loop
    }


    // FLOYD'S CYCLE DETECTION ALGORITHM : END



    // remove loop from a list using FLOYD'S CYCLE DETECTION ALGORITHM : START

    public void removeLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr){
                removeLoop(slowPtr);
                return;
            }
        }
    }


    private void removeLoop(ListNode slowPtr) {
        ListNode temp = head;

        while(temp.next != slowPtr.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    // remove loop from a list using FLOYD'S CYCLE DETECTION ALGORITHM : END


    // merge two sorted lists

    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(a != null && b != null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }
            else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null){
            tail.next = b;
        }
        else{
            tail.next = a;
        }
        return dummy.next;
    }

    // add two numbers using singly linked list

    public static ListNode add(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while(a != null || b != null){
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if(a != null){
                a = a.next;
            }
            if(b != null){
                b = b.next;
            }
        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
