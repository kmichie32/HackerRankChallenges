package com.company;

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger valueOfA = scanner.nextBigInteger();
        BigInteger valueOfB = scanner.nextBigInteger();

        System.out.println(valueOfA.add(valueOfB));
        System.out.println(valueOfA.multiply(valueOfB));
    }
}
