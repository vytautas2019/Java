package com.company;

public class A {



    public static int divide(){
        try{
            return B.divide();
        } catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0 + class A");
        }
        return 0;

    }
}
