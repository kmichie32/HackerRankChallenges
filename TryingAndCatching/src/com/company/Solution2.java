package com.company;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fromUser = scanner.nextLine();

        try{
            int integerConvertedFromString = Integer.parseInt(fromUser);
            System.out.println(integerConvertedFromString);
        } catch (NumberFormatException e){
            System.out.println("Bad String");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}