package com.aman.data_structures;

public class ArrayUtil {

    public static void main(String[] args) {
//        ArrayUtil arrayUtil = new ArrayUtil();
//        arrayUtil.arrayDemo();

        // creating an array
//        int[] arr = {2, 4, 5, 6, 7, 8, 1};
//        printArray(arr);
//        System.out.println(arr.length);


        // calling removeEven function & printing the result
//        int[] result = removeEven(arr);
//        printArray(result);


        // calling reverse method & printing the result
//        reverse(arr, 0, arr.length-1);
//        printArray(arr);


        // calling minimum method & printing the result
//        System.out.println("The minimum value in the array is : " + minimum(arr));


        // calling findSecondMax & displaying the result
//        System.out.println("The second maximum value in the array is : " + findSecondMax(arr));


        // calling moveZeros method & printing the result
//        moveZeros(arr, arr.length);
//        printArray(arr);


        // calling resize method & printing the result
//        arr = resize(arr, 10);
//        System.out.println(arr.length);


        // calling findMissingNumber method & displaying it
//        System.out.println("The missing number int the array is : " + findMissingNumber(arr));


        // calling isPalindrome method & displaying the result
//        System.out.println(isPalindrome("bob"));


        // calling sortedSquares method & printing the result
        int[] arr = {-4, -1, 0, 3, 10};
        printArray(arr);
        int[] arr2 = sortedSquares(arr);
        printArray(arr2);
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

    // find the second max value

    public static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    // move zeroes to the end

    public static void moveZeros(int[] arr, int n){
        int j = 0; // will focus on zeroth elements
        for(int i = 0; i < n; i++){ // will focus on non-zero elements
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }

    // resize an array

    public static int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    // find missing number in an array

    public static int findMissingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }

    // check if palindrome

    public static boolean isPalindrome(String word){
        char[] charArrayWord = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start < end){
            if(charArrayWord[start] != charArrayWord[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // squares of sorted array

    public static int[] sortedSquares(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int i = 0;
        int j = n - 1;

        for(int k = n - 1; k >= 0; k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;
            }
            else{
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        return result;
    }

}
