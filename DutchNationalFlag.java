package com.aman.data_structures;

public class DutchNationalFlag {

    public static void main(String[] args) {
        DutchNationalFlag dnf = new DutchNationalFlag();
        int[] arr = new int[] {0, 0, 1, 2, 0, 1, 2};
        dnf.print(arr);
        dnf.threeNumberSort(arr);
        dnf.print(arr);

    }

    public void print(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void threeNumberSort(int[] arr){
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while(i <= k){
            if(arr[i] == 0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else if(arr[i] == 2){
                swap(arr, i, k);
                k--;
            }
        }
    }
}
