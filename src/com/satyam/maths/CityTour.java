package com.satyam.maths;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CityTour {

    public boolean isDone(int[] visited) {
        for(int i=1;i<visited.length;i++){
            if(visited[i]==0) return false;
        }
        return true;
    }
    public int[] copyArray(int[] arr) {
        int[] newArr= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public int solve(int A,int[] B) {
        int[] visited = new int[A+1];
        Arrays.fill(visited,0);
        for(int i=0;i<B.length;i++){
            visited[B[i]]=1;
        }
        return countWays(visited);
    }
    public int countWays(int[] visited) {
        if(isDone(visited)) {
            //System.out.println(Arrays.toString(visited));
            return 1;
        }
        int numWays = 0;
        HashSet<Integer> set =new HashSet<>();
        for(int i=1;i<visited.length;i++){
            if(visited[i]==1) {
                if(i>=2 && visited[i-1]==0 && set.contains(i-1)==false) {
                    set.add(i-1);
                }
                if(i<visited.length-1 && visited[i+1]==0 && set.contains(i+1)==false){
                    set.add(i+1);
                }
            }
        }
        Iterator<Integer> iterable = set.iterator();
        //System.out.println(Arrays.toString(set.toArray()));
        //System.out.println(Arrays.toString(visited));
        while(iterable.hasNext()) {
            int index = iterable.next();
            //System.out.println(index);
            int[] newVisited = copyArray(visited);
            newVisited[index] = 1;
            numWays+=countWays(newVisited);
        }
        return numWays;
    }
}
