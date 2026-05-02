package com.kunal;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        check(n);
        in.close();
    }
    static void check(int n){
        if(n % 2 == 0) {
           System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
