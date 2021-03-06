package com.aman.data_structures.dynamic_programming;

public class FibonacciNumber {

    public static void main(String[] args) {
        FibonacciNumber fn = new FibonacciNumber();

        // Bottom-Up approach
//        System.out.println("The 6th fibonacci number is : " + fn.fib(6));

        // Top-Down approach
        System.out.println("The 6th fibonacci number is : " + fn.fib(new int[6 + 1], 6));
    }



    // Bottom-Up Approach

    public int fib(int n){
        int[] table = new int[n + 1];

        table[0] = 0;
        table[1] = 1;

        for(int i = 2; i <= n; i++){
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
    }

    // Top-Down Approach

    public int fib(int[] memo, int n){
        if(memo[n] == 0){
            if(n < 2){
                memo[n] = n;
            }
            else{
                int left = fib(memo, n - 1);
                int right = fib(memo, n - 2);
                memo[n] = left + right;
            }
        }
        return memo[n];
    }
}
