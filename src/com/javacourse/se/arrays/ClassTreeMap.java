package com.javacourse.se.arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class ClassTreeMap {

    /* Task: TreeMap Sorting
Description: Create a TreeMap and perform the following operations:
Add five key-value pairs to the TreeMap, where keys are integers and values are strings.
Print the TreeMap in its natural order.
Print the TreeMap in reverse order.*/

    public void treeMapSorting() {

        TreeMap <Integer, String> history = new TreeMap<>();
        history.put(1956, "born");
        history.put(1973, "graduate");
        history.put(1963, "school");
        history.put(1978, "institute");
        history.put(1976, "marriage");

        System.out.println("Normal order: " + history);

        TreeMap<Integer, String> history1 = new TreeMap<>(Collections.reverseOrder());
        history1.put(1956, "born");
        history1.put(1973, "graduate");
        history1.put(1963, "school");
        history1.put(1978, "institute");
        history1.put(1976, "marriage");

        System.out.println("Reverse order: " + history1);


    }
}
