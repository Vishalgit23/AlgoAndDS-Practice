package com.vishal.dsa.maths;

import java.util.*;

public class Divisor {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        int number = 36;
        System.out.println(Math.sqrt(number));
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
        list.stream().sorted().forEach(System.out::println);
    }
}
