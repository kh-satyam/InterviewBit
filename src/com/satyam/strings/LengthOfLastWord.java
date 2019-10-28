package com.satyam.strings;

public class LengthOfLastWord {
    public int lengthOfLastWord(final String A) {
        String[] splitWords = A.split(" ");
        return splitWords.length>0?splitWords[splitWords.length-1].length():0;
    }
}
