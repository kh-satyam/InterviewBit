package com.satyam.strings;

import java.util.ArrayList;

public class ZigZagString {
    public String convert(String A, int B) {
        if(B==1){
            return A;
        }
        ArrayList<StringBuffer> strings = new ArrayList<>();
        for(int i=0;i<B;i++){
            strings.add(new StringBuffer(""));
        }
        int zigZagIterator = 0;
        boolean increasing = true;
        for(int i=0;i<A.length();i++){
            char currChar = A.charAt(i);
            strings.get(zigZagIterator).append(currChar);
            if(increasing){
                zigZagIterator++;
                if(zigZagIterator==B){
                    increasing=false;
                    zigZagIterator-=2;
                }
            }else{
                zigZagIterator--;
                if(zigZagIterator==-1){
                    increasing=true;
                    zigZagIterator+=2;
                }
            }
        }
        StringBuffer result = new StringBuffer();
        for(int i=0;i<strings.size();i++){
            result.append(strings.get(i));
        }
        return result.toString();
    }
}
