package com.company;
//Klasėje A yra kviečiamas klasės B metodas. Klasėje B yra kviečiamas klasės C metodas.
//        Klasės C metodas iššaukia klaidą. Šią klaidą reikia apdoroti klasėje A.

public class Main {

    public static void main(String[] args) {
        A a =new A();

            a.divide();


    }
}
