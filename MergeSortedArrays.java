package com.aman.data_structures;

public class MergeSortedArrays {

    public static void main(String[] args) {
        MergeSortedArrays msa = new MergeSortedArrays();
        int[] arr1 = {2, 5, 7};
        int[] arr2 = {3, 4, 9};
        msa.print(arr1);
        msa.print(arr2);
        
        int[] result = msa.merge(arr1, arr2, arr1.length, arr2.length);
        msa.print(result);
    }

    public void print(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] merge(int[] arr1, int[] arr2, int n, int m){
        int[] result = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < n){
            result[k] = arr1[i];
            i++;
            k++;
        }

        while(j < m){
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
}
