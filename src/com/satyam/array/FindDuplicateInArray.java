package com.satyam.array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {
    public int repeatNumber(final List<Integer> a) {
//        Set<Integer> set  = new HashSet<>();
//        int res = -1;
//        for(int i=0;i<a.size();i++) {
//            if(set.contains(a.get(i))) {
//                return a.get(i);
//            }else{
//                set.add(a.get(i));
//            }
//        }
//        return res;
        final int n = a.size() - 1;
        // int[] A = new int[a.size()];
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x = x ^ i;
        }
        System.out.println(x);
        for (int e : a) {
            x = x ^ e;
        }
        System.out.println(x);
        if (x == 0) return -1;
        else return x;
    }
}
