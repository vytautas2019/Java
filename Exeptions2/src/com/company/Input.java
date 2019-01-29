package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public int input() {

        int value = 0;
        boolean test = true;

        while (test) {
            try {
                System.out.println("Enter an integer: ");
                Scanner i = new Scanner(System.in);
                value = i.nextInt();
                i.close();
                test = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
        }
        return value;
    }
}
