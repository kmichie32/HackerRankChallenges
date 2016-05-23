package com.company;

import java.util.Scanner;

public class SandBox {
    public int maxSumValue;
    public int maxSumHolder;

    public void maxSumOfArray(int array[][]){
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++){
                maxSumHolder = array[x][y] + array[x][y + 1] + array[x][y + 2]
                        + array[x + 1][y + 1] + array[x + 2][y] + array[x + 2][y + 1] + array[x + 2][y + 2];
                if (maxSumHolder > maxSumValue || maxSumHolder == maxSumValue){
                    maxSumValue = maxSumHolder;
                }
            }
        }
        System.out.println(maxSumValue);
    }

    public static void main(String[] args) {
        SandBox solution = new SandBox();
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        solution.maxSumOfArray(arr);

    }

}
