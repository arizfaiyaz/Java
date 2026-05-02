package com.kunal;

import java.util.Scanner;

public class Measurement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double r = in.nextDouble();
        circumference(r);
        area(r);
    }
    static void circumference(double r){
        double circumference = Math.PI * (2 * r);
        System.out.println("Circumference is: " + circumference);
    }

    static void area(double r){
        double area = Math.PI * (r * r);
        System.out.println("Area is: " + area);
    }
}
