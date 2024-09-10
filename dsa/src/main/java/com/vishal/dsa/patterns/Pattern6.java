package com.vishal.dsa.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int row =5;
        for(int i=1 ;i<=row;i++) {
            int k = 1;
            for (int j = 5; j > i; j--) {
                System.out.print(k++);
            }
            System.out.println(i);
        }
    }
}
