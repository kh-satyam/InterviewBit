package com.satyam.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NextPermutation {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        boolean descending = true;
        for(int i=1;i<A.size();i++){
            if(A.get(i)>A.get(i-1)) {
                descending = false;
            }
        }
        if(descending==true) {
            System.out.println("descending");
            reverseList(A,0,A.size()-1);
            return A;
        }
        int index = -1;
        for(int i=A.size()-2;i>=0;i--) {
            if(A.get(i)<A.get(i+1)){
                index = i;
                break;
            }
        }
        //System.out.println("index:"+index);
        int numJustGreater = -1;
        for(int i=index+1;i<A.size();i++){
            if(A.get(i)>A.get(index)) {
                numJustGreater = i;
            }
        }
        //System.out.println("numGreaterindex:"+numJustGreater);
        int temp = A.get(index);
        A.set(index,A.get(numJustGreater));
        A.set(numJustGreater,temp);
        //System.out.println("swap list:" + A.toString());
        reverseList(A,index+1,A.size()-1);
        return A;
    }
    public void reverseList(ArrayList<Integer> A,int i,int j) {
        while(i<j) {
            int temp =A.get(i);
            A.set(i,A.get(j));
            A.set(j,temp);
            i++;
            j--;
        }
    }
}
