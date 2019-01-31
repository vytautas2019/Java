package com.company;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] integerList = {1, 2, 3,4};
        String[] stringList = {"Hello", "world"};
        printArray(integerList);
        printArray(stringList);



    }

    public static <G> void printArray(G[] Array) {
        for (G e : Array)
            System.out.println(e);
    }
}