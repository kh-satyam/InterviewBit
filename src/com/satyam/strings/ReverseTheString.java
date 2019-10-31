package com.satyam.strings;

public class ReverseTheString {
    public String solve(String A) {
        String string = A.strip();
        String[] words = A.split("\\s+");
        StringBuffer reversedString = new StringBuffer();
        for(int i=words.length-1;i>=0;i--){
            String currWord = words[i];
            reversedString.append(currWord);
            if(i!=0){
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }
}
