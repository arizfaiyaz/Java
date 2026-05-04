package com.ariz;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // input using for loop
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();

        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        for( int num : arr){
            System.out.print(num + " ");
        }
    }

}

/*
We can also print in another way and it is the way
to do it.
System.out.println(Arrays.toString(arr));
 */
