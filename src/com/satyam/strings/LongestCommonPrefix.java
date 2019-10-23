package com.satyam.strings;

public class LongestCommonPrefix {
    public StringBuffer findCommonPrefix(String a,String b){
        int i=0;
        int j=0;
        StringBuffer cp = new StringBuffer();
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                cp.append(a.charAt(i));
            }else{
                break;
            }
            i++;
            j++;
        }
        return cp;
    }
    public String longestCommonPrefix(String[] A) {
        StringBuffer lcp = new StringBuffer();
        if(A.length==1){
            return A[0];
        }
        StringBuffer cp = findCommonPrefix(A[0],A[1]);
        //System.out.println(cp);
        if(A.length==2){
            return cp.toString();
        }else{
            for(int i=2;i<A.length;i++){
                cp = findCommonPrefix(cp.toString(),A[i]);
                //System.out.println(cp);
            }
            return cp.toString();
        }
    }
}
