package com.ariz;

public class Mountain {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                // you are in dec part of an array
                // this may be the ans, but look at the left
                // this is why end != mid -1
                end  = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // cuz we know that mid + 1 > mid element
            }
        }
        //in the end start == end and point to the largest number
        // start and end are always trying to find the max element in the above 2 checks
        // hence, when they are pointing to just one element , that is max one
        //and if we are saying that one element is remaining hence cuz that's the answer
        return start; // end both are okay

    }
}
