package com.vishal.dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n  = 5;
        int facto =  fact(n);
        System.out.println(facto);
    }

    private static int fact(int n) {
        if(n ==1 ){
            return 1;
        }
        return n* fact(n-1);
    }
}
