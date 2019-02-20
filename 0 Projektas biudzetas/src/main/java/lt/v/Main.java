package lt.v;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Pajamos pajamos = new Pajamos();
        Islaidos islaidos = new Islaidos();




        while(true){
            spausdintiMeniu();


            Scanner scanner = new Scanner(System.in);
            int choice;
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    pajamos.spausdintiKategorijas();
                    int choice2 = scanner.nextInt();
                    while(choice2 > 0 && choice2 < 8) {
                        System.out.println("Iveskite suma: ");
                        double choice3=scanner.nextDouble();
                        pajamos.setKategorijosSuma(choice2-1,choice3);
                        String x=pajamos.getKategorijosreiksme(choice2-1);
                        Biudzetas.irasai.add(new Irasas(choice3,"Pajamos",x) );
                        pajamos.spausdintiKategorijas();
                        choice2 = scanner.nextInt();
                    }

                    break;
                case 2:
                    islaidos.spausdintiKategorijas();
                    choice2 = scanner.nextInt();
                    while(choice2 > 0 && choice2 < 10){
                        System.out.println("Iveskite suma: ");
                        islaidos.setKategorijosSuma(choice2-1,scanner.nextDouble());
                        islaidos.spausdintiKategorijas();
                        choice2 = scanner.nextInt();
                    }
                    break;
                case 3:
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
        System.out.println(Biudzetas.irasai);
        System.out.println("Iveskite skaiciu is meniu...");
        System.out.println();

    }

}