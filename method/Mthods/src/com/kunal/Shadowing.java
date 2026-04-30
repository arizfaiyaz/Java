package com.kunal;

public class Shadowing {
    static int x = 90; // this will be shadowed
    public static void main(String[] args) {
        System.out.println(x); // this will print 90
        int x = 40;
        System.out.println(x); // print 40
        fun();
    }

    static void  fun() {
        System.out.println(x);
    }
}
// int x; --> declaring a variable
// x = 10; --> init a variable

/*

How to Access Shadowed Variables
If you need to reach the "hidden" outer variable, you can use specific keywords:
this keyword: Use this.variableName to access shadowed instance variables within the same class.
Class Name: For shadowed static (class) variables, use ClassName.variableName

Shadowing vs. Hiding
While often used interchangeably, they are technically different in Java:
Shadowing: Happens within a single class when local variables overlap with instance variables.
Hiding: Happens in inheritance when a child class declares a variable with the same name as one in its parent class. You use the super keyword to access the hidden parent variable.

 */