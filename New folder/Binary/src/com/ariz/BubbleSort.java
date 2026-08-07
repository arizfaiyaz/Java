package com.ariz;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {};
    }
    static void bubbleSort(int[] arr){
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++){
            // for each step, max item will come at the last respective index
            for (int j; j < arr.length - i; j++){
                //swap if the item is smaller
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
