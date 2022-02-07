package com.aman.data_structures;

public class BinarySearch {

    public int binarySearch(int[] nums, int key){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (high + low)/2;
            if(nums[mid] == key){
                return mid;
            }
            if(key < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1, 10, 20, 30, 40, 55, 65, 75, 85};
        System.out.println(bs.binarySearch(nums, 65));  // returns the index number
    }
}
