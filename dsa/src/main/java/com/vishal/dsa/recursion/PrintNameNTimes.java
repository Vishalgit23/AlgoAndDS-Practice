package com.vishal.dsa.recursion;

public class PrintNameNTimes {
    static  int time = 6;
    static int cnt = 0;
    static String name = "Vishal";
    public static void main(String[] args) {
        printName(time,cnt,name);
    }

    private static void printName(int time, int cnt, String name) {
        if(cnt == time){
            return;
        }
        System.out.println(name);
        printName(time,++cnt,name);
    }
}
