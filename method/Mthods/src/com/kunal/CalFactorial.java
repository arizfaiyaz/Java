package com.kunal;

import java.util.Scanner;

public class CalFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        if(n < 0){
            System.out.println("Invalid input");
        } else {
            int result = factorial(n);
            System.out.println(result);
        }

    }
    static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}
