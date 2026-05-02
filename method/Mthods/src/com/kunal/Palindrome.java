package com.kunal;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        boolean result = isPalindrome(n);
        System.out.println(result);
    }
    static boolean isPalindrome(int n){
        int reverse = 0;
        int temp = Math.abs(n);
        while(temp !=0){
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return (reverse == Math.abs(n));
    }
}
