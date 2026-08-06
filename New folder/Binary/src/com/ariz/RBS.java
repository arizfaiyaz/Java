package com.ariz;

public class RBS {
    public static void main(String[] args) {

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length -1);
        }
        if (target == nums[pivot]) {
            return pivot;
        }

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

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            // 4 cases -->
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
