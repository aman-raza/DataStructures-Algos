package com.aman.data_structures;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 51}
        };

        // creating an instance of SortedMatrix class
        SortedMatrix sm = new SortedMatrix();
        sm.search(matrix, matrix.length, 33);
    }

    // search in the sorted matrix

    public void search(int[][] matrix, int n, int x){
        int i = 0;
        int j = n - 1;

        while(i < n && j >= 0){
            if(matrix[i][j] == x){
                System.out.println("X found at : " + i + "," + j);
            }
            if(matrix[i][j] > x){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not Found");
    }
}
