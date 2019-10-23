package com.satyam.strings;

import java.util.Stack;

public class CountAndSay {
    public String nextSequence(String sequence){
        StringBuilder nextSequence = new StringBuilder();
        int count=1;
        for(int i=1;i<sequence.length();i++){
            if(sequence.charAt(i)==sequence.charAt(i-1)){
                count++;
            }else{
                nextSequence = nextSequence.append(Integer.toString(count) +String.valueOf(sequence.charAt(i-1)));
                count=1;
            }
        }
        nextSequence = nextSequence.append(Integer.toString(count) +String.valueOf(sequence.charAt(sequence.length()-1)));
        return nextSequence.toString();
    }
    public String countAndSay(int A) {
        String sequence = "1";
        for(int i=1;i<A;i++){
            String prev = sequence;
            sequence = nextSequence(prev);
        }
        return sequence;
    }
}
