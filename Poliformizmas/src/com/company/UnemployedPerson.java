package com.company;
//+3.Sukurkite klases EmployedPerson ir UnemployedPerson kurios pavaldėtų PrivatePerson klasę ir įgyvendintų abstrakčius metodus

public class UnemployedPerson extends PrivatePerson{
    public   void getEmploymentStatus() {
        System.out.println("UnemployedPerson getEmploymentStatus");

    }
    public UnemployedPerson(String personalID, String name, String gender) {
        super(personalID,name,gender) ;

    }
}
