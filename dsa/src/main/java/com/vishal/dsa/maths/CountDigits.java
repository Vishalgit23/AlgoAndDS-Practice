package com.vishal.dsa.maths;

public class CountDigits {
    public static void main(String[] args) {
        int digit = 12;
        int counter = 0;
        while (digit>0){
            digit = digit/10;
            counter ++;
        }
        System.out.println(counter);

//        Or there is more optimal solution to this
        int cnt = (int) (Math.log10(digit) + 1);    //
        System.out.println(cnt);

    }
}
