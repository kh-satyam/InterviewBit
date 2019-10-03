package com.satyam.array;

import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<>();
        if(A==0) return pascalTriangle;
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        pascalTriangle.add(row1);
        for(int i=1;i<A;i++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            ArrayList<Integer> prevRow = pascalTriangle.get(i-1);
            newRow.add(1);
            for(int j=1;j<prevRow.size();j++) {
                int elem = prevRow.get(j-1) + prevRow.get(j);
                newRow.add(elem);
            }
            newRow.add(1);
            pascalTriangle.add(newRow);
        }
        return pascalTriangle;
    }
}
