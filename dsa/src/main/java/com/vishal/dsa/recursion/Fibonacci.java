package com.vishal.dsa.recursion;

public class Fibonacci {
    static int term =  6;
    public static void main(String[] args) {
         // 0,1,1,2,3,5
        System.out.println(0);
        printFibo(1,0,1);
    }

    private static void printFibo(int cnt, int i, int i1) {
        if (term <  cnt) {
            return;
        }

        System.out.println(i1);
        printFibo(++cnt,i1,i+i1);
    }
}
