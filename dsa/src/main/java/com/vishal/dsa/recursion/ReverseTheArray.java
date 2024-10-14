package com.vishal.dsa.recursion;

public class ReverseTheArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int size = arr.length;
        printArrayReverse(size,arr);
    }

    private static void printArrayReverse(int size, int[] arr) {
        if(size <= 0){
            return;
        }
        System.out.println(arr[size-1]);
        printArrayReverse(size-1,arr);
    }

}
