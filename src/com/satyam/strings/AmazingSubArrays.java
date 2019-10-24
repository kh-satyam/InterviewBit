package com.satyam.strings;

public class AmazingSubArrays {
    public boolean isVowel(char character){
        if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u'
            || character=='A'||character=='E'||character=='I'||character=='O'||character=='U'){
            return true;
        }
        return false;
    }
    public int solve(String A) {
        long count=0;
        for(int i=0;i<A.length();i++){
            if(isVowel(A.charAt(i))){
                count+=(A.length()-i);
            }
        }
        return (int)(count%10003);
    }
}
