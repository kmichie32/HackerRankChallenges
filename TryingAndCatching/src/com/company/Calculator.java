package com.company;

import java.io.*;
import java.util.*;


public class Calculator {

    public int power(int n, int p) {
        int finalValue= 1;

        if( n < 0 || p <0){
            throw new IllegalArgumentException("n and p should be non-negative");
        }

        for(int i = 0; i < p; i++){
            finalValue *= n;
        }
        return finalValue;
    }

}