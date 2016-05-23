package com.company;

import java.util.*;

public class Solution {
    public int additionFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number + additionFactorial(number - 1);
        }
    }

    public int[] setBuilder(int numberToCreateSetWith){
        int[] setHolder = new int[numberToCreateSetWith];
        for(int i = 0; i < setHolder.length; i++){
            setHolder[i]= i+1;
        }
        return setHolder;
    }

    public int[] bitWiseANDValues(int[] setHolder, int sizeOfArrayFinal){
        int[] valueHolder = new int[sizeOfArrayFinal];
        int q = 0;
        for(int i = 0; i < setHolder.length; i++){
            for(int j = i+1; j < setHolder.length;j++) {
                if (j > i) {
                    valueHolder[q] = (setHolder[i] & setHolder[j]);
                    q++;
                }
            }
        }
        return valueHolder;
    }

    public int[] comparingBitWiseValuesToAComparativeValue(int comparisonValue, int[] valueHolder){
        int[] valuesFromHolderAdjustedToComparisonValue = new int[valueHolder.length];
        for(int i = 0; i < valueHolder.length; i++){
            if(valueHolder[i]>= comparisonValue){
                valuesFromHolderAdjustedToComparisonValue[i] = 0;
            }
            else{
                valuesFromHolderAdjustedToComparisonValue[i]= valueHolder[i];
            }
        }
        return valuesFromHolderAdjustedToComparisonValue;
    }

    public void returnMaximumValueAfterAdjustment(int[] adjustedValues) {
        int maxSumHolder = 0;
        int maxSumValue = 0;
        for (int i = 0; i < adjustedValues.length; i++) {
            maxSumHolder = adjustedValues[i];
            if (maxSumHolder > maxSumValue || maxSumHolder == maxSumValue) {
                maxSumValue = maxSumHolder;
            }
        }
        System.out.println(maxSumValue);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        int[] arr = new int[numberOfTestCases*2];

        // Working on building the number of cases
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            int numberForSet = arr[i];
            int comparisonValue = arr[i+1];

            int[] setHolder = solution.setBuilder(numberForSet);
            int integerValueForAdditionFactorial = numberForSet - 1;
            int sizeOfArrayFinal = solution.additionFactorial(integerValueForAdditionFactorial);
            int[] valueHolder = solution.bitWiseANDValues(setHolder,sizeOfArrayFinal);
            int[] adjustedValues = solution.comparingBitWiseValuesToAComparativeValue(comparisonValue, valueHolder);
            solution.returnMaximumValueAfterAdjustment(adjustedValues);
            i++;
        }


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}