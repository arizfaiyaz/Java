package com.kunal;

public class ReverseArray {
    public static void main(String[] args) {

    }
    static void reverse(int[] arr){
        int left = 0;
        int right =  arr.length-1;
        while (left <  right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    // Second Largest number
    static int secondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num :  arr){
            if (num > first) {
                second = first;
                first = num;
            } else if ( num < second){
                second = num;
            }
        }
        return second;
    }

}
