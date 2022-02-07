package com.aman.data_structures;

public class BinarySearch {

    public int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
//            int mid = (high + low)/2;  // or
            int mid = low + (high - low)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(key < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    // Given a sorted array find the target index, if index not found return the index where it would be if it were inserted in order

    public int searchInsert(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
//            int mid = (high + low)/2;  // or
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1, 10, 20, 30, 40, 55, 65, 75, 85};
        System.out.println(bs.binarySearch(arr, 65));  // returns the index number
    }
}
