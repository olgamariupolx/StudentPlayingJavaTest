package com.javacourse.se.lesson14;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

class Years {
    public static void main (String [] args) {
        Integer [] year = {1092, 1223, 1988, 2009, 1778, 2023, 1065, 2017, 1324, 1129};
        Arrays.sort(year);
        System.out.print(Arrays.toString(year));
        System.out.println();
        Arrays.sort(year,reverseOrder());
        System.out.print(Arrays.toString(year));
    }
    }


