package com.javacourse.se.arrays;

import java.util.HashMap;

public class ClassHashMap {

    /*Task: HashMap Iterations
Description: Create a HashMap and perform the following operations:
Add five key-value pairs to the HashMap.
Iterate over the HashMap and print all the keys and values.*/

    public void hashMapIterations () {
        HashMap <Integer, String> map = new HashMap<Integer, String>();
        map.put(-3, "Poland");
        map.put(1, "Germany");
        map.put(51, "Italy");
        map.put(7, "Norway");
        map.put(87, "Spain");

        System.out.println("Numbers: " + map.keySet());
        System.out.println("Values: " + map.values());


    }

}
