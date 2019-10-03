package com.satyam.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleQueries {
    public int productOfDivisors(int num) {
        long res =1;
        long mod = (long)Math.pow(10,9)+7;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                res = ((res%mod)*(i%mod))%mod;
            }
        }
        return (int)res;
    }
    public ArrayList<Integer> solve(List<Integer> A, List<Integer> B) {
        ArrayList<Integer> G = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            for(int j=i;j<A.size();j++){
                int max = Integer.MIN_VALUE;
                for(int k=i;k<=j;k++){
                    max = Integer.max(max,A.get(k));
                }
                G.add(max);
            }
        }
        for(int i=0;i<G.size();i++){
            G.set(i,productOfDivisors(G.get(i)));
        }
        //System.out.println(G.toString());
        Collections.sort(G,Collections.reverseOrder());
        ArrayList<Integer> kThElementList = new ArrayList<>();
        for(int i=0;i<B.size();i++){
            kThElementList.add(G.get(B.get(i)-1));
        }
        //System.out.println(kThElementList.toString());
        return kThElementList;
    }
}
