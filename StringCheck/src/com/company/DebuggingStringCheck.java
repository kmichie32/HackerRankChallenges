package com.company;

public class DebuggingStringCheck {
    public boolean isValidWord(String string){
        //...some randome code that checks if string is a valid word
        return true; //need a return statement
    }


    public String stringInputHolder = "";
    public int i;
    public int k = 0;

    public String wordChecker(String inputString) {
        String stringLengthHolder = inputString;
        for (i = 0; i < stringLengthHolder.length(); i++) {
            if (isValidWord(inputString.substring(k, i))) {
                stringInputHolder += inputString.split(inputString.substring(k, i));
                k = i + 1;
            } else {
                i++;
            }
        }
        return stringInputHolder;
    }

    public void printVariables(){
        System.out.println(wordChecker("somestringandstuff"));
    }

    public static void main(String[] args) {
        StringCheck checkingWords = new StringCheck();
        checkingWords.printVariables();
    }
}