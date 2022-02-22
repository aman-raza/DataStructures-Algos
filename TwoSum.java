package com.aman.data_structures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = new int[] {2, 11, 5, 10, 7, 8};
        int[] result1 = twoSumI(numbers, 9);
        int[] result2 = twoSumII(numbers, 9);
        System.out.println("Two indices are : " + result1[0] + " and " + result1[1]);
        System.out.println("Two indices are : " + result2[0] + " and " + result2[1]);
    }

    public static int[] twoSumI(int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            if(!map.containsKey(target - numbers[i])){
                map.put(numbers[i], i);
            }
            else{
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("Two numbers not found");
    }

    public static int[] twoSumII(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            }
            else if(sum < target){
                left++;
            }
            else {
                left--;
            }
        }
        throw new IllegalArgumentException("Two numbers not found");
    }
}
