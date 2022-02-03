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

        // calling search method & printing the result
        sm.search(matrix, matrix.length, 33);


        // calling spiralPrint method & printing the result
        sm.spiralPrint(matrix, 4, 4);
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

    // print matrix in spiral form

    public void spiralPrint(int[][] matrix, int r, int c){
        int i, k = 0, l = 0;
        while(k < r && l < c){
            for(i = l; i < c; i++){
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for(i = k; i < r; i++){
                System.out.print(matrix[i][c - 1] + " ");
            }
            c--;
            if(k < r){
                for(i = c - 1; i >= l; i--){
                    System.out.print(matrix[r - 1][i] + " ");
                }
                r--;
            }
            if(l < c){
                for(i = r - 1; i >= k; i--){
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }
}
