package com.aman.data_structures;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = new int[] {2, 5, 1, 3, 9, 7};
        qs.print(arr);
        qs.sort(arr, 0, arr.length - 1);
        qs.print(arr);
    }

    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i= low;
        int j = low;
        while(i <= high){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;  // pivot index
    }

    public void sort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
    }
}
