package com.satyam.strings;

public class Atoi {
    public int atoi(final String A) {
        StringBuilder stringBuilder = new StringBuilder("");
        int startingIndex=0;
        boolean negative = false;
        for(int i=0;i<A.length();i++){
            if((A.charAt(i)=='-' || A.charAt(i)=='+')){
                if(A.charAt(i)=='-') negative=true;
                startingIndex =i+1;
                break;
            }
            else if(A.charAt(i)>=48 && A.charAt(i)<=57){
                startingIndex=i;
                break;
            }else if(A.charAt(i)!=' '){
                return 0;
            }
        }
        for(int i=startingIndex;i<A.length();i++){
            if(A.charAt(i)>=48 && A.charAt(i)<=57){
                stringBuilder.append(A.charAt(i));
            }else{
                break;
            }
        }
        String number = stringBuilder.toString();
        System.out.println("number:"+number);
        int i=0;
        if(number.length()>0 && number.charAt(0)=='0') i=1;
        long result = 0l;
        for(;i<number.length();i++){
            char c = number.charAt(i);
            if(c>=48 && c<=57){
                long temp = result*10+(c-48);
                if(temp<Integer.MAX_VALUE && temp>Integer.MIN_VALUE){
                    result = temp;
                }else{
                    if(negative) return Integer.MIN_VALUE;
                    else return Integer.MAX_VALUE;
                }
            }else{
                return 0;
            }
        }
        if(negative) result=result*-1;
        System.out.println(result);
        if(result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) result;
    }
}
