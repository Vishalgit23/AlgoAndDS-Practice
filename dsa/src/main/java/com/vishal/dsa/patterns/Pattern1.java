package com.vishal.dsa.patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int row = 10;
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
