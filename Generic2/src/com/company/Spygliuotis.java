package com.company;

public class Spygliuotis implements Medis {
    @Override
    public void turi() {
        System.out.println(getClass().getSimpleName()+" turi spyglius");

    }
}
