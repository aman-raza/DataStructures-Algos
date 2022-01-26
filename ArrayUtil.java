package com.aman.data_structures;

public class ArrayUtil {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
    }

    // print an array

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // creating an array

    public void arrayDemo(){
        int[] myArray = new int[5];

        myArray[0] = 5;
        myArray[1] = 4;
        myArray[2] = 3;
        myArray[3] = 2;
        myArray[4] = 1;

        printArray(myArray);

        // printing length of array
        System.out.println("Length of the array: " + myArray.length);

        // printing last element of the array
        System.out.println("Last element of the array : " + myArray[myArray.length - 1]);

        // creating & printing an array
        int[] arr = {5, 4, 3, 2, 1};
        printArray(arr);

    }

}
