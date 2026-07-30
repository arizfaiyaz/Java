package com.kunal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements you want");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the target");
        int target = scanner.nextInt();
        int ans = linearSearch(nums, target);
        System.out.println("Element found at index: " + ans);
    }

    // Search in the array: return the index if the item is found

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // if no target found, this will be executed
        return -1;
    }
}
