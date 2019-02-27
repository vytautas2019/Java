package com.company;

import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        NameGenerator generator = new NameGenerator();
        List<Name> names = generator.generateNames(9999999);
        for (int i=0; i<names.size(); i++){
            System.out.println(i+": "+names.get(i));
        }

        //names.forEach(System.out::println);

    }
}
