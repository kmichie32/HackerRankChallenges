package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();

        myLinkedList.add("First"); // adds a node with data="First" to back of the (empty) list
        myLinkedList.add("Second"); // adds a node with data="Second" to the back of the list
        myLinkedList.addFirst("Third"); // inserts a node with data="Third" at front of the list
        myLinkedList.addLast("Fourth"); // inserts a node with data="Fourth" at back of the list
        myLinkedList.add(2, "Fifth"); // inserts a node with data="Fifth" at index 2
        System.out.println(myLinkedList); // print the list: [Third, First, Fifth, Second, Fourth]
        System.out.println();
        System.out.println();

        // Adding an existing value to the list
        myLinkedList.add("Fourth");
        System.out.println(myLinkedList);
// Print the value at list index 2:
        System.out.println(myLinkedList.get(2));
        System.out.println();
        System.out.println();

// Empty the list
        myLinkedList.clear();
        System.out.println(myLinkedList); // print the newly emptied list: []

        myLinkedList.add("Sixth"); // adds a node with data="Sixth" to back of the (empty) list
        System.out.println(myLinkedList); // print the list: [Sixth]
    }


}
