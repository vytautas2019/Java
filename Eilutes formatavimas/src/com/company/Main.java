package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] vardai = new String[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vardai.length; i++) {
            System.out.println("Iveskite varda");
            String vardas = sc.nextLine();
            if (vardas != null) {
                vardai[i] = vardas;

            }


        }
        for (int i = 0; i < vardai.length; i++) {
            System.out.println(vardai[i] +"-" +vardai[i].length() +" raidziu-" + i +" elementas" );

        }
        String zvaigzdutes = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println( zvaigzdutes);
            zvaigzdutes+="*";

        }
    }
}
