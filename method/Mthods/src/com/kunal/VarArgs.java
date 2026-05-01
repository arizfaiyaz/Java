package com.kunal;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(...v: 2, 3, 4, 45, 34);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
