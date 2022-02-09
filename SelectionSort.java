package com.aman.data_structures;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = new int[] {5, 1, 2, 9, 10};
        ss.print(arr);
        ss.sort(arr);
        ss.print(arr);
    }

    public void print(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
