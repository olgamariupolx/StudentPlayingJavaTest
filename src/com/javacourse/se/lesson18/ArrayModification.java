package com.javacourse.se.lesson18;

import java.util.Arrays;
import java.util.Comparator;


public class ArrayModification {

    public static double[] arr;

    public static void doubleElementsOfArray(Double[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] * 2 + " ");
            }
        } else {
            System.out.print("Mistake");
        }
        System.out.println();
    }

    public static void halfElementsOfArray(Double[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] / 2 + " ");
            }
        } else {
            System.out.print("Mistake");
        }
        System.out.println();
    }

    public static void sortAndDoubleElementsOfArray(Double[] arr, boolean sortOrder) {
        if (arr != null && arr.length > 0) {
            Double[] arrayForModification = arr; //для наглядности, можно это не делать, а оперировать c arr
            Arrays.sort(arrayForModification);
            if (!sortOrder) {
                Arrays.sort(arrayForModification, Comparator.reverseOrder());
                doubleElementsOfArray(arrayForModification);   // ссылка на метод; можно и так doubleElementsOfArray(arr);
            } else {
                doubleElementsOfArray(arrayForModification);
            }
        } else {
            System.out.print("Mistake");
        }
    }

    public static void sortAndHalfElementsOfArray(Double[] arr, boolean sortOrder) {
        if (arr != null && arr.length > 0) {
            Double[] arrayForModification = arr;
            Arrays.sort(arrayForModification);
            if (!sortOrder) {
                Arrays.sort(arrayForModification, Comparator.reverseOrder());
                halfElementsOfArray(arrayForModification);
            } else {
                halfElementsOfArray(arrayForModification);
            }
        } else {
            System.out.println("Mistake");
        }

    }
}
/*
package com.javacourse.se.lesson5;

import com.javacourse.se.lesson18.ArrayModification;

public class Main {
    public static void main (String [] args) {
        Double [] arr = new Double [] {5.0, 2.0, 1.0, 8.0, 10.0};
        Boolean sortOrder = false;
        ArrayModification.doubleElementsOfArray(arr);
        ArrayModification.halfElementsOfArray(arr);
        ArrayModification.sortAndDoubleElementsOfArray(arr, sortOrder);
        ArrayModification.sortAndHalfElementsOfArray(arr, sortOrder);


    }
} */