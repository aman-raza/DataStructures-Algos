package com.aman.data_structures;

import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public Stack(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.peek());


        // calling reverse method & printing the result
        String str = "ABCD";
        System.out.println("Before reverse : " + str);
        System.out.println("After reverse : " + reverse(str));
    }


    // pushes an element

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    // removes the top element

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    // displays the recent added element

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    // reverse a string

    public static String reverse(String str){
        Stack stack = new Stack();
        char[] chars = str.toCharArray();

        for(char c : chars){
            stack.push(c);
        }

        for(int i = 0; i < str.length(); i++){
            chars[i] = (char) stack.pop();
        }
        return new String(chars);
    }
}
