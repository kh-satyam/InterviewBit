package com.satyam.JumpToLevel3;

import java.util.ArrayList;

public class PrettyPrint {
    public int getDistance(int x,int y,int xCenter,int yCenter){
        int xDistance = Math.abs(xCenter-x);
        int yDistance = Math.abs(yCenter-y);
        //System.out.println("x:"+x+" y:"+y+" "+xDistance+" "+yDistance);
        return Integer.max(xDistance,yDistance);
    }
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int rows = 2*A-1;
        int cols = 2*A-1;
        int xCenter = A-1;
        int yCenter = A-1;
        System.out.println(rows);
        System.out.println(cols);
        ArrayList<ArrayList<Integer>> grid = new ArrayList<>();
        for(int i=0;i<rows;i++){
            grid.add(new ArrayList<>());
        }
        for(int i=0;i<rows;i++){
            ArrayList<Integer> row = grid.get(i);
            for(int j=0;j<cols;j++){
                row.add(0);
            }
        }
        grid.get(yCenter).set(xCenter,1);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //System.out.println(i+" "+j);
                if(!(i==xCenter && j==yCenter)){
                    grid.get(i).set(j,getDistance(i,j,xCenter,yCenter)+1);
                }
            }
        }
        return grid;
    }
}
