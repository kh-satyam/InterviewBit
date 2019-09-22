package com.satyam.maths;

public class GreatestCommonDivisor {
    public int gcd(int A,int B) {
        if(A==0 || B==0) {
            return Math.max(A,B);
        }
        if(A==1 || B==1) {
            return 1;
        }
        int gcd = 1;
        for(int i=Math.min(A,B);i>0;i--){
            if(A%i==0 && B%i==0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
