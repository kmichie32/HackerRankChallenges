package com.company;

import java.util.Scanner;

public class Solution {

    public String[] wordIndexer(String fromUser, int substringCount){
        String[] wordIndexHolder = new String[fromUser.length()-substringCount+1];

        for(int i = 0; i+substringCount<= fromUser.length(); i++){
            wordIndexHolder[i] = fromUser.substring(i, i+substringCount);
        }
        return wordIndexHolder;
    }


    public String[] bubbleSort(String[] wordIndexHolder) {
        String[] arraySwap = new String[2];
        for(int j = 0; j < wordIndexHolder.length; j++) {
            for (int i = 0; i < wordIndexHolder.length - 1; i++) {
                if(wordIndexHolder[i].charAt(0) == wordIndexHolder[i + 1].charAt(0)){
                    for(int q = 0; q < wordIndexHolder[i].length(); q++) {
                        for (int k = 1; k < wordIndexHolder[i].length(); k++) {
                            if (wordIndexHolder[i].charAt(k) > wordIndexHolder[i + 1].charAt(k)) {
                                arraySwap[0] = wordIndexHolder[i + 1];
                                arraySwap[1] = wordIndexHolder[i];
                                wordIndexHolder[i] = arraySwap[0];
                                wordIndexHolder[i + 1] = arraySwap[1];
                            }
                        }
                    }
                }

                if (wordIndexHolder[i].charAt(0) > wordIndexHolder[i + 1].charAt(0)) {
                    arraySwap[0] = wordIndexHolder[i + 1];
                    arraySwap[1] = wordIndexHolder[i];
                    wordIndexHolder[i] = arraySwap[0];
                    wordIndexHolder[i + 1] = arraySwap[1];
                }
            }
        }
        return wordIndexHolder;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String fromUser = scanner.nextLine();
        int substringCount = scanner.nextInt();

        String[] wordIndexHolder = solution.wordIndexer(fromUser,substringCount);
        String[] orderedWordIndexHolder = solution.bubbleSort(wordIndexHolder);
        String[] bubblesortedAgain = solution.bubbleSort(orderedWordIndexHolder);

        System.out.println(bubblesortedAgain[0]);
        System.out.println(bubblesortedAgain[bubblesortedAgain.length -1]);
    }
}
