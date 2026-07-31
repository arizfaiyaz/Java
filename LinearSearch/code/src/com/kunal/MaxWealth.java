// https://leetcode.com/problems/richest-customer-wealth/description/

package com.kunal;

public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts){
        // person == row, account == col
        int maxWealth = 0;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
              sum += anInt;
            }
            if (sum   > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}

