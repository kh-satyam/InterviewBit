package com.satyam.array;

import java.util.Arrays;

public class WaveArray {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        for(int i=1;i<A.length;i+=2) {
            swap(A,i,i-1);
        }
        return A;
    }

    public void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
