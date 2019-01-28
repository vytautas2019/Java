package com.company;

//1.Sukurkite abstrakčią klasę Person su laukais personalID, name, gender




public abstract class Person {
    private     String personalID;
    private   String name;
    private    String gender;

    public String getPersonalID() {
        return personalID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Person() {
    }

    public Person(String personalID, String name, String gender) {
        this.personalID = personalID;
        this.name = name;
        this.gender = gender;
    }
}



