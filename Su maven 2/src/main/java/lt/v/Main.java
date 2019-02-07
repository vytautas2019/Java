package lt.v;
//Atsisiųskite javafaker biblioteką ir pridėkite ją į Intellij projektą nenaudojant Maven.
//        Panaudokite javafaker https://github.com/DiUS/java-faker pvz. sugeneruokite 100 gatvių pavadinimų, 100 celsijaus laipsnio temperatūrų ir pan.
//        Sukurkite Maven projektą, įdėkite javafaker priklausomybę ir perkelkite klases iš ankstesio projekto, t.y. nerašykite kodo kviečiančio javafaker dar kartą.

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        System.out.println(name+" "+firstName+" "+lastName+" "+streetAddress);
    }

}
