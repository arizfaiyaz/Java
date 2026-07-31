/*
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
*/
package com.kunal;

public class EvenDigits {
    public static void main(String[] args) {

    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // func to check if a number is even or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
    // count the number of digits in a number
    static int digits(int num){
        if (num < 0){
            num = num * -1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }

    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
