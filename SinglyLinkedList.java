package com.aman.data_structures;

public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        // creating nodes

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // connecting all nodes together

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        // calling functions
        sll.display();
    }

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private ListNode head;

    // display method

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
