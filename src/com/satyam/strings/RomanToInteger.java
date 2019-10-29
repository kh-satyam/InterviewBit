package com.satyam.strings;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String A) {
        int answer = 0;
        int i=0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        while(i<A.length()) {
            char c = A.charAt(i);
            int value = map.get(c);
            //System.out.println("value");
            if(i+1<A.length() && map.get(A.charAt(i+1))>value){
                value = map.get(A.charAt(i+1))-value;
                //System.out.println("updated:"+value);
                i++;
            }
            answer+=value;
            //System.out.println("ans:"+answer);
            i++;
        }
        return answer;
    }
}
