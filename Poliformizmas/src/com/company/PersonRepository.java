package com.company;
//6.Sukurkite klasę PersonRepository, kuri turėtų šį statinį metodą: List<Person> getPersons(). Šis metodas turėtų grąžinti visų potipių Person objektų pavyzdžius.

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PersonRepository extends Person{

    public PersonRepository(String personalID, String name, String gender) {
        super(personalID,name,gender) ;

    }

    public List<Person> getPerson() {
        return personList;

    }


}

