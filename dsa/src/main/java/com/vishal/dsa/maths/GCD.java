package com.vishal.dsa.maths;

public class GCD {
    public static void main(String[] args) {
        int commonDivisor = 0;
        int num1 = 7;
        int num2 = 5;
        int cnt = 1;
        while (num1 >= cnt || num2 >= cnt){
            if(num1%cnt == 0 && num2%cnt == 0){
                commonDivisor = cnt;
            }
            cnt++;
        }
        System.out.println(commonDivisor);

    }
}
