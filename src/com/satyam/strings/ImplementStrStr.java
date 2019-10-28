package com.satyam.strings;

public class ImplementStrStr {
    public int[] lps(String A) {
        int[] lps = new int[A.length()];
        lps[0]=0;
        for(int i=1;i<A.length();i++) {
            int j = lps[i - 1];
            while (j > 0 && A.charAt(i) != A.charAt(j)) {
                j = lps[j - 1];
            }
            if (A.charAt(i) == A.charAt(j)) j++;
            lps[i] = j;
        }
        return lps;
    }
    public int strStr(final String B,final String A) {
        if(A.length()>B.length()) return -1;
        int[] lps = lps(A);
        for(int i=0,j=0;i<B.length();){
            if(A.charAt(j)==B.charAt(i)){
                i++;
                j++;
            }
            if(j==A.length()){
                return i-j;
            }else if(i<B.length() && A.charAt(j)!=B.charAt(i)){
                if(j>0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;
    }
}
