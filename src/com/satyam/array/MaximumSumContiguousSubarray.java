package com.satyam.array;

public class MaximumSumContiguousSubarray {
    public int maxSubArray(final int[] A) {
        int maxSum = A[0];
        int tempSum = A[0];
        for(int i =1;i<A.length;i++) {
            if( A[i] > tempSum+A[i]) {
                tempSum = A[i];
            }else{
                tempSum += A[i];
            }
            maxSum = Integer.max(tempSum,maxSum);
        }
        return maxSum;
    }
}
