package com.satyam.maths;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    public void arrange(ArrayList<Integer> arr) {
        for(int i=0;i<arr.size();i++) {
            int curr_value = arr.get(i);
            int new_value_to_get = arr.get(arr.get(i));
            if(new_value_to_get < 0) {
                new_value_to_get = -1 * (new_value_to_get/arr.size());
            }
            arr.set(i,  -1 * (curr_value*arr.size() + new_value_to_get));
        }
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.size();i++){
            arr.set(i,(-1 * arr.get(i))%arr.size());
        }
    }
}
