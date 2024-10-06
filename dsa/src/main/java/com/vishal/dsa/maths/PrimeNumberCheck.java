package com.vishal.dsa.maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 452;
        List<Integer> divisors = getTheDivisors(number);
        if(number ==1 || divisors.size()==2){
            System.out.println("prime Number " + number);
        } else
            System.out.println("not a prime number "+number);
    }

    private static List<Integer> getTheDivisors(int number) {
        List<Integer> list = new ArrayList<>();
        int count =0 ;
        for(int i=1; i<=Math.sqrt(number);i++ ){
            if(number%i==0){
                list.add(i);
                if(i != number/i){
                    list.add(number/i);                }
            }

        }


        // Sort the list in ascending order

        // Print the sorted list using stream
        return list;
    }
}
