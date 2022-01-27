package com.aman.data_structures;

public class ArrayUtil {

    public static void main(String[] args) {
//        ArrayUtil arrayUtil = new ArrayUtil();
//        arrayUtil.arrayDemo();

        // creating an array
        int[] arr = {2, 4, 3, 6, 7, 9, 1};
        printArray(arr);


        // calling removeEven function & printing the result
//        int[] result = removeEven(arr);
//        printArray(result);


        // calling reverse method & printing the result
//        reverse(arr, 0, arr.length-1);
//        printArray(arr);


        // calling minimum method & printing the result
        System.out.println("The minimum value in the array is : " + minimum(arr));
    }

    // print an array

    public static void printArray(int[] arr){
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

    // remove even integer from an array

    public static int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }


    // reverse the array

    public static void reverse(int[] numbers, int start, int end){
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    // find the minimum value

    public static int minimum(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }

        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

}
