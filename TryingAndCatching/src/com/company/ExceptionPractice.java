package com.company;

public class ExceptionPractice {

    public static void main(String[] args) {
       /* int[] intArray = new int[10];
        try{
            System.out.println(intArray[10]);//Slots are only from 0-9
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("The following index is outside the array length: " + e.getMessage());
        }*/

        try{
            int[] c = new int[6];
            System.out.println("Element 6 at index 5 = " + c[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown " + e);
        }
        finally {
            System.out.println("If all else fails, this will print.");
        }

    }
}
