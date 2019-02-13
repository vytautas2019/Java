package lt.v;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Imone> imoniuList=new ArrayList<Imone>();
//        Imone imone1 = new Imone("Labar",584556544,224);
//        Imone imone2 = new Imone("Laivai",66666666,7778);
//        imoniuList.add(imone1);
//        imoniuList.add(imone2);
//        imoniuList.add(new Imone("Auto",888888888,152));
//        System.out.println(imoniuList);
        Faker faker = new Faker();
//
//        String name = faker.name().fullName(); // Miss Samanta Schmidt
//        String firstName = faker.name().firstName(); // Emory
//        String lastName = faker.name().lastName(); // Barton
//        System.out.println(name);
//        String name1 = faker.company().name();
//        System.out.println(name1);
//        long number1=faker.number().randomNumber();
//        System.out.println(number1);
//        long numbere = faker.number().randomNumber();
//
//        Imone imone3 = new Imone(name1,number1,numbere);
//        imoniuList.add(imone3);
//        System.out.println(imoniuList);
        for (int i=0;i<5;i++){
            String name2 = faker.company().name();
            long number2=faker.number().randomNumber();
            long numbere2 = faker.number().randomNumber();
            Imone imone22 = new Imone(name2,number2,numbere2);
            imoniuList.add(imone22);
        }
        System.out.println(imoniuList);


    }
}
