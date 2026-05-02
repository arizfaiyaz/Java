package com.kunal;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int  n = in.nextInt();
        int result = findsum(n);
        System.out.println(result);
    }
    static int findsum(int n){
        int sum = 0;
        for( int i=1; i <=n; i++){
            sum = sum + i;
        }
        return sum;
    }
}
