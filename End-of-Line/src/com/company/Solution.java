package com.company;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (scanner.hasNextLine()) {
            System.out.println(i + " " + scanner.nextLine());
            i++;
        }
        scanner.close();
    }
}
