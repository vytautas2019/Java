package com.company;

import java.util.*;

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


    }
}
