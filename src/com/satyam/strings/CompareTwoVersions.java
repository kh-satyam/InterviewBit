package com.satyam.strings;

import java.math.BigInteger;

public class CompareTwoVersions {
    public int compareVersion(String A, String B) {
        String[] arrA = A.split("\\.");
        String[] arrB = B.split("\\.");
        System.out.println("lengthA:"+arrA.length);
        System.out.println("lengthB:"+arrB.length);

        for(String x:arrA){
            System.out.print(x+" ");
        }
        System.out.println("");
        for(String x:arrB){
            System.out.print(x+" ");
        }
        System.out.println("");
        int i=0;
        int j=0;
        while(i<arrA.length && j<arrB.length){
            //System.out.println(i+" "+j);
            BigInteger a = new BigInteger(arrA[i]);
            BigInteger b = new BigInteger(arrB[j]);
            //System.out.println("val:"+a+" "+b);
            if(a.compareTo(b)>0){
                return 1;
            }
            else if(a.compareTo(b)<0){
                return -1;
            }else{
                System.out.println("equal:"+i+" "+j);
                i++;
                j++;
            }
        }
        if(i==arrA.length && j==arrB.length){
            return 0;
        }
        else if(i==arrA.length){
            if(Integer.valueOf(arrB[j])==0) return 0;
            return -1;
        }else{
            if(Integer.valueOf(arrA[j])==0) return 0;
            return 1;
        }
    }
}
