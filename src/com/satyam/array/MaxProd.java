package com.satyam.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MaxProd {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] leftMaxIndex = new int[A.size()];
        leftMaxIndex[0]=0;
        stack.push(0);
        for(int i=1;i<A.size();i++) {
            while(stack.isEmpty()==false && A.get(i)>=A.get(stack.peek())) {
                stack.pop();
            }
            if(stack.empty()==true) {
                leftMaxIndex[i]=0;
            }else{
                leftMaxIndex[i]=stack.peek();
            }
            stack.push(i);
        }
        while(stack.isEmpty()==false){
            stack.pop();
        }
        stack.push(A.size()-1);
        int[] rightMaxIndex =  new int[A.size()];
        rightMaxIndex[A.size()-1] = 0;
        for(int i=A.size()-2;i>=0;i--){
            while(stack.isEmpty()==false && A.get(i)>=A.get(stack.peek())) {
                stack.pop();
            }
            if(stack.isEmpty()){
                rightMaxIndex[i]=0;
            }else{
                rightMaxIndex[i]=stack.peek();
            }
            stack.push(i);
        }
        long result = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            long product = 1l*leftMaxIndex[i] * rightMaxIndex[i];
            if(product>result) {
                result= product;
            }
        }
        return (int)(result%1000000007);
    }
}
