package com.satyam.strings;

public class PalindromeString {
    public int isPalindrome(String A) {
        A = A.toLowerCase();
        System.out.println(A);
        StringBuffer newA = new StringBuffer();
        for(int i=0;i<A.length();i++){
            if((A.charAt(i)>=97 && A.charAt(i)<=122) || (A.charAt(i)>=48 && A.charAt(i)<=57)){
                newA.append(A.charAt(i));
                System.out.println(newA);
            }
        }
        A = newA.toString();
        System.out.println(A);
        int i=0,j=A.length()-1;
        boolean isPalindrome = true;
        while(i<j)
        {
            if(A.charAt(i)!=A.charAt(j)){
                isPalindrome=false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome?1:0;
    }
}
