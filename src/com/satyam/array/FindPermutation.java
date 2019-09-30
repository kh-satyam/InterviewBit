package com.satyam.array;

import java.util.ArrayList;

public class FindPermutation {
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> sortedNumbersList = new ArrayList<>();
        for(int i=1;i<=B;i++){
            sortedNumbersList.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = sortedNumbersList.size()-1;
        if(A.charAt(0)=='I') {
            result.add(sortedNumbersList.get(leftIndex++));

        }else{
            result.add(sortedNumbersList.get(rightIndex--));
        }
        for(int i=0;i<A.length()-1;i++){
            if(A.charAt(i)=='I' && A.charAt(i+1)=='I') {
                result.add(sortedNumbersList.get(leftIndex++));
            }
            else if(A.charAt(i)=='I' && A.charAt(i+1)=='D') {
                result.add(sortedNumbersList.get(rightIndex--));
            }
            else if(A.charAt(i)=='D' && A.charAt(i+1)=='I') {
                result.add(sortedNumbersList.get(leftIndex++));
            }
            else{
                result.add(sortedNumbersList.get(rightIndex--));
            }
        }
        result.add(sortedNumbersList.get(leftIndex));
        return result;
    }
}
