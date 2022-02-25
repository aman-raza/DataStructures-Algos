package com.aman.data_structures;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(findProduct(arr)));
    }

    public static int[] findProduct(int[] arr){
        int temp = 1;
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = temp;
            temp = temp * arr[i];
        }
        temp = 1;
        for(int i = arr.length - 1; i >= 0; i--){
            result[i] = result[i] * temp;
            temp = temp * arr[i];
        }
        return result;
    }
}
