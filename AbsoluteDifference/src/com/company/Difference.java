package com.company;

public class Difference {
    private int[] elements;
    public int maximumDifference;
    public int maxHolder;
    public int maxValue;
    public int minValue;
    public int minHolder;

    public Difference(int[] elements){
        this.elements = elements;
    }

    public int returnMaxNumber(int[] putExampleHere){
        for(int i = 0; i< putExampleHere.length -1; i++){
            maxHolder = Math.max(putExampleHere[i], putExampleHere[i+1]);
            if(maxHolder > maxValue){
                maxValue = maxHolder;
            }
        }
        return maxValue;
    }

    public int returnMinNumber(int[] putOtherExampleHere){
        minValue = putOtherExampleHere[0];
        for(int j = 0; j< putOtherExampleHere.length -1; j++){
            minHolder = Math.min(putOtherExampleHere[j], putOtherExampleHere[j+1]);
            if(minHolder < minValue){
                minValue = minHolder;
            }
        }
        return minValue;
    }

    public int computeDifference(){
        maximumDifference=Math.abs(returnMaxNumber(elements)-returnMinNumber(elements));
        return maximumDifference;
    }
}
