package com.company;
//2.Sukurkite abstrakčią klasę PrivatePerson kurį paveldėtų klasę Person, ir turėtų abstrakčius metodus, getEmploymentStatus();
//+4.Pridėkite PrivatePerson statinį metodą, kuris pagal nurodytus parametrus sukurtų EmployedPerson arba UnemployedPerson

public abstract class PrivatePerson extends Person {

    public PrivatePerson(String personalID, String name, String gender) {
        super(personalID,name,gender) ;
    }

    abstract void getEmploymentStatus();




}