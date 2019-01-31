package com.company;

import java.util.Arrays;
import java.util.List;

public class Print {


        public static void printVisiMedziai(List < ? extends Medis > list){
            for (Medis n : list) {
                n.turi();
            }
        }

    public static void printSpygliuociaiMedziai(List < ? extends Spygliuotis > list){
        for (Spygliuotis n : list) {
            n.turi();
        }
    }



}
