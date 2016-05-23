package com.company;

import java.util.Scanner;

public class StringCheck {
    Scanner scanner = new Scanner(System.in);

    public boolean isValidWord(String string){
        //...some randome code that checks if string is a valid word
        return false; //need a return statement
    }

    public String inputString = scanner.nextLine();

    public String[] stringInputHolder = new String[inputString.length()];
    public int i;
    public int j = 0;
    public int k = 0;

    public boolean wordChecker(String someString) {
        for (i = 0; i < stringInputHolder.length; i++) {
            if (isValidWord(someString.substring(j, i))) {
                stringInputHolder[k] = String.valueOf(someString.split(someString.substring(k, i)));
                j = i + 1;
                k++;
            } else {
                i++;
            }
        }
        if(someString.length() == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void printVariables(){
        System.out.println(wordChecker("somestringandstuff"));
    }

    public static void main(String[] args) {
        StringCheck checkingWords = new StringCheck();
        checkingWords.wordChecker(inputString);
    }
}
