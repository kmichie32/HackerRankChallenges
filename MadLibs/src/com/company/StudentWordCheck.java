package com.company;

import java.util.Scanner;

public class StudentWordCheck {
    public boolean isValidWord(String anything){
        return true;
    }
    Scanner scannerVariableHolder = new Scanner(System.in);
    String wordsFromUser = scannerVariableHolder.nextLine();
    String testwords ="";
    public static void main(String args[]){

        //cant modify wordsFromUser length when running a loop that uses it
        for(int i = 0;i<wordsFromUser.length()){
            if(isValidWord(wordsFromUser.substring(0,i+1))){ //if all the characters from 0 to the index spot is a word
                int temp = wordsFromUser.substring(0,i+1).length(); //Copy the words length
                testwords=testwords.substring(i); //Remove the valid word
                i+=temp; //Go up by the amount of index spots to pass the word that was removed
            }else{
                i+=1; //else go up by one
            }
        }
        return(testwords.length()==0); //Returns that there are no invalid words left
    }
}