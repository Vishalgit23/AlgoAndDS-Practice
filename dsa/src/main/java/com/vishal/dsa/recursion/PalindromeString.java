package com.vishal.dsa.recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "ABBA";
        char [] chars = s.toCharArray();
        char [] reverse = new char[chars.length];
        reverseChar(chars,0,chars.length,reverse);
        String reversed =  new String(reverse);
        System.out.println(reversed);
        if (s.equals(reversed)){
            System.out.println("palindrome");
        } else
            System.out.println("no");

    }

    private static void reverseChar(char[] chars,int i,int length,char[] reverse) {
        if(length <= 0){
            return;
        }
        reverse[i++] = (chars[length-1]);
        reverseChar(chars,i,length-1,reverse);
    }
}
