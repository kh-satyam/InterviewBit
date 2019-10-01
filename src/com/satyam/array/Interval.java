package com.satyam.array;

public class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }

    public Interval(int s, int e) { start = s; end = e; }

    @Override
    public String toString(){
        return start + " " +end;
    }
}
