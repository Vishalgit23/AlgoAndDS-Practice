package com.vishal.dsa.recursion;

public class PrintNNumbers {
    public static void main(String[] args) {
        int cnt = 0;
        printNumber(cnt);
    }

    private static void printNumber(int cnt) {
        if(cnt == 5){
            return;
           // System.out.println(cnt);
        }
       // printNumber(cnt++); // hahhahahahahhahahahahaha
        System.out.println(cnt);
        printNumber(++cnt);

    }
}
