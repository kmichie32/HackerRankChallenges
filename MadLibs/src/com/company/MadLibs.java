package com.company;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String Adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random random = new Random();

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public String getAdjective2() {
        return Adjective2;
    }

    public void setAdjective2(String adjective2) {
        this.Adjective2 = adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    public void setRandomNums(String randomNums) {
        this.randomNums = randomNums;
    }


    public void printInstructions(){
        System.out.println("Welcome to the MadLibs game. If you type "+
        "words, we'll give you a story. Start by typing a name.");
    }

    public void enterName(){
        setName(scanner.nextLine());
    }
    public void enterNoun1(){
        setNoun1(scanner.nextLine());
    }
    public void enterNoun2(){
        setNoun2(scanner.nextLine());
    }
    public void enterNoun3(){
        setNoun3(scanner.nextLine());
    }
    public void enterAdjective1(){
        setAdjective1(scanner.nextLine());
    }
    public void enterAdjective2(){
        setAdjective2(scanner.nextLine());
    }

    public void putTogetherTheStory(){
        String story ="Jessie and her best friend " +
                getName()+ " went to Disney World today! "
                + "They saw a " + getNoun1() + " in a show at the Magic Kingdom "
                + " and ate a "+ getAdjective1() + " feast for dinner."
                + " The next day I ran "+ getAdverb() + "to meet Mickey Mouse in his "
                + getNoun2() + " and then that night I gazed at the " + getRandomNums()
                + " " +getAdjective2() + " fireworks shooting from the "
                + getNoun3() + ".";
        setStory(story);
    }


    public static void main(String[] args) {
	// write your code here
        MadLibs game = new MadLibs();
        game.printInstructions();
    }
}
