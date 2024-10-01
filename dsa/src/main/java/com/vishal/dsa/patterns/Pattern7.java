package com.vishal.dsa.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int row = 5;

        for (int i=0;i<row;i++){
                for (int k = 0;k<row-i-1;k++){
                    System.out.print(" ");
                }
                for (int j = 0;j<2*i+1;j++){
                    System.out.print("*");
                }
            for (int k = 0;k<row-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
