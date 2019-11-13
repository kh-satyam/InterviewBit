package com.satyam.twoPointers;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        int i=0,j=0;
        while(i!=A.size() && j!=B.size()){
            int elem1 = A.get(i);
            int elem2 = B.get(j);
            if(elem1==elem2){
                i++;
                j++;
                result.add(elem1);
            }else if(elem1>elem2){
                j++;
            }else{
                i++;
            }
        }
        return result;
    }
}
