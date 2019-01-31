package com.company;

public class Lapuotis implements Medis {
    @Override
    public void turi() {
        System.out.println(getClass().getSimpleName()+" turi lapus");
    }
}
