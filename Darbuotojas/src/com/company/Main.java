package com.company;

public class Main {

    public static void main(String[] args) {
        Darbuotojas d1 = new Darbuotojas("Valdas", 1500, 220);
        d1.gautiInfo();
        Darbuotojas d2 = new Darbuotojas();
        d1.pridetiAlyginima();
        d1.gautiInfo();
        d1.pridetiDarba(8);
        d1.gautiInfo();
        d1.isvalytiK();
        d1.gautiInfo();

    }
}
