package com.company;
//+Sukurkite klasę Payment su laukais id, name, paymentDate, recipientId, payerId
//
//        Sukurkite statinį metodą, kuris priimtų int tipo parametrą. Parametras nurodo, kiek Payment reikšmių reikia sugeneruoti. Dinamiškai generuokite Payment objektus ir grąžinkite sąrašą su nurodytu reikšmių kiekiu
//
//        Padarykite, kad generuojami id laukai kartais pasikartotų
//
//        Naudokite metodo grąžinamus duomenis sukurti ArrayList bei LinkedList sąrašus (duomenys abiejose kolekcijose turi būti tokie patys). Sukurtos kolekcijos turėtų būti įvairaus dydžio - nuo kelių iki kelių tūkstančių elementų
//
//        Paskaičiuokite List sąsajos metodų (add, delete, get) vykdymo laikus skirtingiems įgyvendinimams. Atkreipkite dėmesį, kaip laikai skiriasi nuo sąrašo dydžio
//
//        Paverskite sąrašą į rinkinį, įsitikinkite, kad besikartojančios reikšmės dingsta

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Payment> randomPayments = Payment.getRandomPayments(20);
        for (Payment payment : randomPayments) {
            System.out.println(payment);
        }

    }
}
