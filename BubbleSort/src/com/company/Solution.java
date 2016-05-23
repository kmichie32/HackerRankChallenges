package com.company;

import java.io.*;
import java.util.*;



public class Solution {
    public int numberOfSwaps = 0;


    public void bubbleSort(int[] arrayWithRandomValues){
        int[] arraySwap = new int[2];
        for (int i = 0; i < arrayWithRandomValues.length; i++) {
            for (int j = 0; j < arrayWithRandomValues.length-1; j++) {
                if (arrayWithRandomValues[j] > arrayWithRandomValues[j + 1]) {
                    arraySwap[0]= arrayWithRandomValues[j + 1];
                    arraySwap[1]= arrayWithRandomValues[j];
                    arrayWithRandomValues[j] = arraySwap[0];
                    arrayWithRandomValues[j+1] = arraySwap[1];
                    numberOfSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in "+ numberOfSwaps+ " swaps." );
        System.out.println("First Element: "+ arrayWithRandomValues[0]);
        System.out.println("Last Element: "+ arrayWithRandomValues[arrayWithRandomValues.length-1]);
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeFromUser = scanner.nextInt();
        int[] arrayFromUserValues = new int[sizeFromUser];
        for (int i = 0; i < sizeFromUser; i++){
            arrayFromUserValues[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        solution.bubbleSort(arrayFromUserValues);

    }
}
