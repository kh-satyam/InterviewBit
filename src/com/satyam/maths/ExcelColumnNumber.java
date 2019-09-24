package com.satyam.maths;

public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int columnNumner =0;
        int base = 26;
        for(int i=0;i<A.length();i++) {
            char character = A.charAt(i);
            int charToIntMap = character-65+1;
            columnNumner = columnNumner*base + charToIntMap;
        }
        return columnNumner;
    }
}
