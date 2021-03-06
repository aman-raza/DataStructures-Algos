package com.aman.data_structures;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = new int[] {5, 1, 2, 9, 10};
        is.print(arr);
        is.sort(arr);
        is.print(arr);
    }

    public void print(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print (arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}
