package com.vishal.dsa.maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int digit= 4554;
        int reverseDigit = reverseDigit(digit);
        if(reverseDigit == digit)
            System.out.println("number is palindrome "+digit);
        else
            System.out.println("number is not palindrome "+digit);
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
