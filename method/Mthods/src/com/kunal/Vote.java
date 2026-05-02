package com.kunal;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        checker(age);
    }
    static void checker(int age){
        if(age > 29){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }
}
