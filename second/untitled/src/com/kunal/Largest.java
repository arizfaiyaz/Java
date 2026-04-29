package com.kunal;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // find the largest number out of the 3
        // 1nd way to do it
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

        // 2rd way to do it
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
