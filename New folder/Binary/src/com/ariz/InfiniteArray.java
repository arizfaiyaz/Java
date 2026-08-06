package com.ariz;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 120, 130, 150};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        //first fine the range
        // first strat with a box of size 2
        int start = 0;
        int end = 1;
        // condition for range
        while (target > arr[end]){
            int newStart = end + 1; //this is my new start
            //double the box value
            // end = prev end + sizeof box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while (start <= end) {
            // find the middle element
            // int mid = (start + end)/2;
            int mid = start + (end - start) / 2;
            if ( target < arr[mid]){
                end = mid - 1;
            } else if ( target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
