package com.aman.data_structures.dynamic_programming;

public class FibonacciNumber {

    public static void main(String[] args) {
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println("The 6th fibonacci number is : " + fn.fib(6));
    }

    public int fib(int n){
        int[] table = new int[n + 1];

        table[0] = 0;
        table[1] = 1;

        for(int i = 2; i <= n; i++){
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
    }
}
