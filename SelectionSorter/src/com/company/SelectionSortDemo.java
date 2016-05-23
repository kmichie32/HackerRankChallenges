package com.company;



import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(7, 15);
        System.out.println(Arrays.toString(a));

        SelectionSorter.sort(a);

        System.out.println(Arrays.toString(a));

    }
}
