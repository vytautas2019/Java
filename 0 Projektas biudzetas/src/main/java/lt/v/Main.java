package lt.v;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Pajamos pajamos = new Pajamos();
        Islaidos islaidos = new Islaidos();
        Biudzetas biudzetas= new Biudzetas();
        Irasas irasas=new Irasas();

        ObjectMapper mapper1 = new ObjectMapper();
        File file1 = new File("C:\\Users\\VytautasB\\Desktop\\JP\\Java\\0 Projektas biudzetas\\Records.json");
        biudzetas.irasai = mapper1.readValue(file1, new TypeReference<List<Irasas>>(){});
        System.out.println(biudzetas.getIrasai());

        Irasas maxId = biudzetas.irasai.stream().max(Comparator.comparing(Irasas::getId)).get();
        System.out.println(maxId.getId());
        Irasas.setIdSet(maxId.getId());




        for (Irasas o:biudzetas.irasai) {
            if(o.getLesuTipas().equals("Pajamos") ){

                int index = 0;
                switch (o.getKategorija()) {
                    case "Atlyginimas":  index = 0;
                        break;
                    case "NT Nuoma":  index = 1;
                        break;
                    case "Stipendija":  index = 2;
                        break;
                    case "Ismoka":  index = 3;

                        break;
                    case "Investicijos":  index = 4;
                        break;
                    case "Dovana":  index = 5;
                        break;
                    case "Palikimas":  index = 6;
                        break;
                    case "Kita":  index = 7;
                        break;

                }
                pajamos.setKategorijosSuma(index,o.getSuma());

            }else {
                int index = 0;
                switch (o.getKategorija()) {
                    case "Parduotuves":  index = 0;
                        break;
                    case "Lizingas":  index = 1;
                        break;
                    case "Bustas":  index = 2;
                        break;
                    case "Mokslai":  index = 3;

                        break;
                    case "Pramogos":  index = 4;
                        break;
                    case "Automobilis":  index = 5;
                        break;
                    case "Sodyba":  index = 6;
                        break;
                    case "Sveikata":  index = 7;
                        break;
                    case "Kita":  index = 7;
                        break;
                }
                islaidos.setKategorijosSuma(index,o.getSuma());
            }

            }






        while(true){
            spausdintiMeniu();



            Scanner scanner = new Scanner(System.in);
            int choice;
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    pajamos.spausdintiKategorijas();
                    int choice2 = scanner.nextInt();
                    while(choice2 > 0 && choice2 < 9) {
                        System.out.println("Iveskite suma: ");
                        double choice3=scanner.nextDouble();
                        pajamos.setKategorijosSuma(choice2-1,choice3);
                        biudzetas.irasai.add(new Irasas(choice3,"Pajamos",pajamos.getKategorijosreiksme(choice2-1)));
                        pajamos.spausdintiKategorijas();
                        choice2 = scanner.nextInt();
                    }

                    break;
                case 2:
                    islaidos.spausdintiKategorijas();
                    choice2 = scanner.nextInt();
                    while(choice2 > 0 && choice2 < 10){
                        System.out.println("Iveskite suma: ");
                        double choice3=scanner.nextDouble();
                        islaidos.setKategorijosSuma(choice2-1,choice3);
                        biudzetas.irasai.add(new Irasas(choice3,"Islaidos",islaidos.getKategorijosreiksme(choice2-1)) );
                        islaidos.spausdintiKategorijas();
                        choice2 = scanner.nextInt();
                    }
                    break;
                case 3:
                    irasas.spausdintiKategorijas();

                    pajamos.spausdintiDetaliaInformacija();
                    System.out.println("---------------------");
                    islaidos.spausdintiDetaliaInformacija();
                    System.out.println("---------------------");
                    System.out.println("Pajamos: "+ pajamos.getSuma()+Valiuta.EUR);
                    System.out.println("Islaidos: "+ islaidos.getSuma()+Valiuta.EUR);
                    System.out.println("---------------------");
                    System.out.println("Balansas: "+(pajamos.getSuma()-islaidos.getSuma())+Valiuta.EUR);
                    break;
                case 4:
                    ObjectMapper mapper = new ObjectMapper();
                    File file = new File("Records.json");
                    mapper.writeValue(file,biudzetas.getIrasai());

                    System.exit(0);
            }
        }
    }
    public static void spausdintiMeniu(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("| 1. Iveskite pajamu informacija    |");
        System.out.println("| 2. Iveskite islaidu informacija   |");
        System.out.println("| 3. Irasai ir ju redagavimas       |");
        System.out.println("| 4. Baigti darba                   |");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("|    Iveskite skaiciu is meniu...   |");
        System.out.println("-------------------------------------");


    }

}