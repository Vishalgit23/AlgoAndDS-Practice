package com.vishal.dsa.recursion;

public class SumOfNNumber {
    static int nNumber = 10;


    public static void main(String[] args) {
        int sum = sumOfNumber(nNumber,1);
        System.out.println(sum);
        System.out.println("BY FORMULA");
        int s = (nNumber*(nNumber+1))/2;
        System.out.println(s);
    }
    private static int sumOfNumber(int nNumber,int cnt) {
     if(cnt==nNumber){
         return  cnt;
     }
     return cnt +sumOfNumber(nNumber,++cnt);
    }


}
