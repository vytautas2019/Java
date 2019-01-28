package com.company;
//+5.Sukurkite klasę LegalPerson kuri paveldėtų Person klasę. Kviečiant metodą getGender() turėtų būti metama UnsupportedOperationException, kadangi juridiniai asmenys neturi lyties.

        public class LegalPerson extends Person {
            public LegalPerson(String personalID, String name) {
                super(personalID, name);
            }

                public String getGender () {
                    String message = "UnsupportedOperationException";
                    System.out.println(message);
                    return message;


                }
        }