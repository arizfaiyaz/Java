package com.kunal;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // --+ block code +--
            a = 5;
            // here we can change the value of a variable init outside of the block.
            int c = 78;
            /* but we can not init the same variable outside the block
            but we can change the value and init a new variable..
            * */
        }
        System.out.println(a);
        // System.out.println(c);
        // we can not access c because it is inside a block
    }

    static void random(){
        int num = 67;
        System.out.println(num);
    }
}
