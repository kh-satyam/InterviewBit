package com.satyam.maths;

public class SumOfPairwiseHammingDistances {

    public int findHammingDistance(int a,int b){
        int xorNum = a^b;
        int iteratorNum = 1;
        int hammingDistance = 0;
        for(int i=0;i<32;i++){
            int bit = iteratorNum & xorNum;
            if(bit>=1) {
                hammingDistance+= 1;
            }
            //System.out.println(iteratorNum & xorNum);
            iteratorNum = iteratorNum<<1;
        }
        return hammingDistance;
    }

    public int findPairwiseHammingDistance(int[] arr) {
        long sum=0;
        for(int i=0;i<31;i++) {
            long zeroCount = 0;
            for(int j=0;j<arr.length;j++){
                if((arr[j] & (1<<i))==0) zeroCount++;
            }
            sum= (sum + 2 * zeroCount * (arr.length-zeroCount))%1000000007;
        }
        return (int)sum;
    }
}
