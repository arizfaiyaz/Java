package com.ariz;

/*
https://leetcode.com/problems/sqrtx/description/
 */

public class MySqrt  {
    public static void main(String[] args) {

    }
    static int mySqrt(int x){
        if (x == 0){
            return 0;
        }
        int start = 1;
        int end = x;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (x == mid){
                return mid;
            } else if (mid > x /mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}