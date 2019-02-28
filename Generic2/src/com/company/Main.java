package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Azuolas azuolas =new Azuolas();
        azuolas.turi();
        Kadagys kadagys =new Kadagys();
        kadagys.turi();
        List<Medis> ivairusMiskas=new ArrayList<Medis>() ;
        ivairusMiskas.add(azuolas);
        ivairusMiskas.add(new Berzas());
        Print.printVisiMedziai(ivairusMiskas);
        List<Spygliuotis> spygliuociuMiskas=new ArrayList<Spygliuotis>() ;
        spygliuociuMiskas.add(new Pusis());
        spygliuociuMiskas.add(new Kadagys());
        Print.printSpygliuociaiMedziai(spygliuociuMiskas);
        String persons = Stream.of("Java")
                .findFirst()
                .orElse("Spring");
        System.out.println(persons);
        LocalDate x= LocalDate.parse("2019-02-28").minus(1, ChronoUnit.MILLENNIA);
        System.out.println(x);

    }
}
