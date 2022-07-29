package com.dennis;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExample {

    public void arrayExample() {
        /*Arrays */
        String[] fruits = new String[6]; //declearing an array of Stings with size of 6
        int[] ages = new int[9]; //declearing an array in int with size of 9
        fruits[0] = "mango"; //adding item to the fruit array at index o
        fruits[1] = "cashew"; // adding cashew to the fruit array at index 1
        fruits[2] = "pawpaw";
        fruits[4] = "grape";
        fruits[5] = "orange";

        String[] names = {"dennis", "atul", "josh", "sarah", "mariam"}; //declearing and initilizing an array at the same time

        ArrayList myList = new ArrayList(); //declearing a generic array list. This can accept different data types
        myList.add("Hello"); // adding item to the arrayList
        myList.add("mary");
        myList.add("john");
        myList.add("mangi");
        myList.add(6);
        myList.add(true);

        ArrayList<String> listOfStrings = new ArrayList<>(); //declearing an array list that can only hold strings
        listOfStrings.add("josh");
        listOfStrings.add("mary");
        listOfStrings.add("juilet");

        System.out.println(Arrays.toString(fruits)); //printing the fruits
        System.out.println(names); //printing the names
        System.out.println(myList); //printing the mylist
    }
}
