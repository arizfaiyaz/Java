package com.ariz;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        //Syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        // input
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        // output
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}
