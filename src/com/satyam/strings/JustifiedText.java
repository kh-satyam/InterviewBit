package com.satyam.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class JustifiedText {
    public ArrayList<String> fullJustify(ArrayList<String> A, int B) {
        ArrayList<String> lines = new ArrayList<>();
        int startingWordIndex = 0;
        int currentWordIndex = 0;
        int currentLineSize = 0;
        while(currentWordIndex<A.size()){
            if(A.get(currentWordIndex).length() + currentLineSize + (currentWordIndex-startingWordIndex) <= B){
                currentLineSize+=A.get(currentWordIndex).length();
            }else{
                StringBuffer line = new StringBuffer();
                int spaces = B - (currentLineSize);
                int numberOfSlots = (currentWordIndex-1-startingWordIndex);
                int[] slots = new int[numberOfSlots>0?numberOfSlots:1];
                if (numberOfSlots > 0) {
                   slots = new int[numberOfSlots];
                    Arrays.fill(slots,0);
                    int slotIterator = 0;
                    for(int i=0;i<spaces;i++){
                        slots[slotIterator]+=1;
                        slotIterator = (slotIterator+1)%numberOfSlots;
                    }
                }
                int slotIndex = 0;
                for(int i = startingWordIndex;i<currentWordIndex;i++){
                    line.append(A.get(i));
                    if(numberOfSlots > 0){
                        if(slotIndex<numberOfSlots){
                            StringBuffer space = new StringBuffer();
                            for(int k=0;k<slots[slotIndex];k++){
                                space.append(" ");
                            }
                            line.append(space);
                        }
                    }
                    slotIndex++;
                }
                startingWordIndex = currentWordIndex;
                currentLineSize=A.get(currentWordIndex).length();
                if(line.length()<B){
                    int sizeDiff = B-line.length();
                    for(int k=0;k<sizeDiff;k++){
                        line.append(" ");
                    }
                }
                lines.add(line.toString());
            }
            currentWordIndex++;
        }
        if(currentLineSize>0){
            StringBuffer line = new StringBuffer();
            for(int i=startingWordIndex;i<currentWordIndex;i++){
                if(i!=currentWordIndex-1){
                    line.append(A.get(i)+" ");
                }else{
                    line.append(A.get(i));
                }
            }
            if(line.length()<B){
                int sizeDiff = B-line.length();
                for(int k=0;k<sizeDiff;k++){
                    line.append(" ");
                }
            }
            lines.add(line.toString());
        }
        return lines;
    }
}
