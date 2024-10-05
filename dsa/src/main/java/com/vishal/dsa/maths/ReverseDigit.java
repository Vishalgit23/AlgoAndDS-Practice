package com.vishal.dsa.maths;

public class ReverseDigit {
    public static void main(String[] args) {
        int digit = 12345;
        System.out.println(reverseDigit(digit));
    }

    private static int reverseDigit(int digit) {
        int revDigit =0;
        while(digit>0){
            int num = digit%10;
            revDigit = revDigit*10+num;
            digit = digit/10;
        }
        return revDigit;
    }
}
