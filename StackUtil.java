package com.aman.data_structures;

import java.util.EmptyStackException;

public class StackUtil {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public StackUtil(){
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
//        String str = "ABCD";
//        System.out.println("Before reverse : " + str);
//        System.out.println("After reverse : " + reverse(str));


        // calling nextGreaterElement method & displaying the result
//        int[] arr = {1, 7, 8, 3, 2, 4, 10};
//        int[] temp = nextGreaterElement(arr);
//        System.out.println(Arrays.toString(temp));


        // calling isValid & printing the result
        System.out.println(isValid("({[]})"));
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
        StackUtil stack = new StackUtil();
        char[] chars = str.toCharArray();

        for(char c : chars){
            stack.push(c);
        }

        for(int i = 0; i < str.length(); i++){
            chars[i] = (char) stack.pop();
        }
        return new String(chars);
    }

    // find next greater element in the array and store it in the new array

    public static int[] nextGreaterElement(int[] arr){
        int[] result = new int[arr.length];
        StackUtil stack = new StackUtil();
        for(int i = arr.length - 1; i >= 0; i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    // valid parentheses problem (Balanced Brackets)

    public static boolean isValid(String s){
        StackUtil stack = new StackUtil();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = (char) stack.peek();
                    if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
