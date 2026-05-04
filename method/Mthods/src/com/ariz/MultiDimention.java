package com.ariz;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimention {
    public static void main(String[] args) {
        /*
          1 2 3
          4 5 6
          7 8 9
          int[][] arr = new int[3][3]
          int[][] arr = new int[3][]
          the second one is also correct because
          the length of the array inside the array
          can wary
          int[][] arr2d = {
                0th index  {1, 2, 3},
                1st index  {3,4},
                2nd index  {4,67,77,34,22,12}
                            }
         */
        int[][] arr = new int[3][2];
        System.out.println(arr.length);

        Scanner in = new Scanner(System.in);
// input
        for(int i = 0; i <arr.length; i++){
            //for each col in every row
            for(int col = 0; col < arr[i].length; col++){
                arr[i][col] = in.nextInt();
            }
        }
        //output
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
        }
    }
}
