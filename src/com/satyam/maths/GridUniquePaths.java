package com.satyam.maths;

public class GridUniquePaths {
    public int uniquePaths(int A,int B) {
        int[][] uniquePaths = new int[A][B];
        for(int i=0;i<A;i++){
            uniquePaths[i][0] = 1;
        }
        for(int j=0;j<B;j++){
            uniquePaths[0][j]=1;
        }

        for(int i=1;i<A;i++){
            for(int j=1;j<B;j++){
                uniquePaths[i][j] = uniquePaths[i][j-1] + uniquePaths[i-1][j];
            }
        }
        return uniquePaths[A-1][B-1];
    }
}
