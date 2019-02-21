package lt.v;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Pajamos pajamos = new Pajamos();
        Islaidos islaidos = new Islaidos();
        Biudzetas biudzetas= new Biudzetas();
        Irasas irasas=new Irasas();

        FileInputStream fileInputStream = new FileInputStream("Records.json");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        biudzetas.irasai = (List<Irasas>) objectInputStream.readObject();
        objectInputStream.close();






        while(true){
            spausdintiMeniu();
            System.out.println(biudzetas.getIrasai());


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
                        String x=pajamos.getKategorijosreiksme(choice2-1);
                        biudzetas.irasai.add(new Irasas(choice3,"Pajamos",x) );
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
                        String x=islaidos.getKategorijosreiksme(choice2-1);
                        biudzetas.irasai.add(new Irasas(choice3,"Islaidos",x) );
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
        System.out.println("1. Iveskite pajamu informacija");
        System.out.println("2. Iveskite islaidu informacija");
        System.out.println("3. Irasai ir ju redagavimas");
        System.out.println("4. Baigti darba");
        System.out.println("Iveskite skaiciu is meniu...");
        System.out.println();

    }

}