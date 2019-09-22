package com.satyam.maths;

public class ReverseInteger {
    public int reverse(int A) {
        boolean negative = false;
        if(A<0){
            negative = true;
            A=A*-1;
        }
        long reverseNum = 0;
        int tenPower = 1;
        while(A>0) {
            int digit = A%10;
            reverseNum = reverseNum*10+digit;
            A=A/10;
        }
        if(reverseNum<Integer.MAX_VALUE && reverseNum>Integer.MIN_VALUE) {
            return negative==true?-1*(int)reverseNum:(int)reverseNum;
        }else{
            return 0;
        }
    }
}
