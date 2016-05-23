package com.company;

public class Example {
    private int[] example = {8, 2, 10, 12};
    public int maxHolder;
    public int maxValue;
    public int minValue;
    public int minHolder;

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

    public void printValue(){
        System.out.println(returnMaxNumber(example)-returnMinNumber(example));
    }


    public static void main(String[] args) {
        Example exampleProblem = new Example();
        exampleProblem.printValue();
    }
}
