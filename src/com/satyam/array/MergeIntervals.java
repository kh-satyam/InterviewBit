package com.satyam.array;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1,Interval i2) {
            if(i1.start<i2.start) {
                return -1;
            }
            else if(i1.start==i2.start) {
                if(i1.end==i2.end) {
                    return 0;
                }
                else if(i1.end<i2.end){
                    return -1;
                }
                else{
                    return 1;
                }
            }
            else {
                return 1;
            }
        }
}
public class MergeIntervals  {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        Collections.sort(intervals,new IntervalComparator());
        Stack<Interval> stack = new Stack<>();
        stack.push(intervals.get(0));
        for(int i=1;i<intervals.size();i++){
            Interval top =  stack.peek();
            Interval currInterval = intervals.get(i);
            while(stack.size()>1 && isOverlapping(top,currInterval)) {
                stack.pop();
                currInterval = mergeIntervals(top,currInterval);
                //System.out.println("mergedf:"+currInterval);
                top=stack.peek();
            }
            if(stack.size()==1 && isOverlapping(top,currInterval)) {
                stack.pop();
                currInterval = mergeIntervals(top,currInterval);
            }
            stack.push(currInterval);
        }
        return new ArrayList<Interval>(stack);
    }

    public boolean isOverlapping(Interval i1,Interval i2) {
        if(i2.start<=i1.end && i2.end>=i1.start) {
            return true;
        }
        return false;
    }
    public Interval mergeIntervals(Interval i1,Interval i2) {
        int start = Integer.min(i1.start,i2.start);
        int end = Integer.max(i1.end,i2.end);
        return new Interval(start,end);
    }
}
