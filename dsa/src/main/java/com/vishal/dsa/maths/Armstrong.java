package com.vishal.dsa.maths;

public class Armstrong {
    public static void main(String[] args) {
        int number = 93084;
        System.out.println("Is this  "+ number + "number is armStrong");
        int computedNumber  = armStrongCheck(number);
        if(computedNumber==number)
            System.out.println("yes");
        else
            System.out.println("no");

    }

    private static int armStrongCheck(int number) {
        int cnt = (int) (Math.log10(number) + 1);
        int armStrong = 0;
        while(number>0){
            int num =  number%10;
            int n = (int)(Math.pow(num,cnt));
            armStrong = armStrong+n;
            number = number/10;
        }
        return armStrong;
    }
}
