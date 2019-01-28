package com.company;
//Polimorfizmo užduotys:

//+1.Sukurkite abstrakčią klasę Person su laukais personalID, name, gender
//+2.Sukurkite abstrakčią klasę PrivatePerson kurį paveldėtų klasę Person, ir turėtų abstrakčius metodus, getEmploymentStatus();
//+3.Sukurkite klases EmployedPerson ir UnemployedPerson kurios pavaldėtų PrivatePerson klasę ir įgyvendintų abstrakčius metodus
//+4.Pridėkite PrivatePerson statinį metodą, kuris pagal nurodytus parametrus sukurtų EmployedPerson arba UnemployedPerson
//Sukurkite klasę LegalPerson kuri paveldėtų Person klasę. Kviečiant metodą getGender() turėtų būti metama UnsupportedOperationException, kadangi juridiniai asmenys neturi lyties.
//Sukurkite klasę PersonRepository, kuri turėtų šį statinį metodą: List<Person> getPersons(). Šis metodas turėtų grąžinti visų potipių Person objektų pavyzdžius.
//Sukurkite klasę PersonFacade kuri turėtų šiuos metodus: List<PrivatePerson > getPrivatePersons(), List<LegalPerson> getLegalPersons(). Šie metodai turėtų kviesti getPersons metodą, filtruoti gautus duomenis pagal reikalingus potipius ir grąžinti rezultatą.
//Sukurkite sąsają Employee, kuri turėtų metodus int getSalary() ir String getEmployerName()
//EmployedPerson turėtų įgyvendinti Employee sąsają
//Sukurkite sąsają Employer, kuri turėtų metodus int getRevenue() ir List<Employee getEmployees()`
//PrivatPerson klasė turėtų įgyvendinti sąsają Employer
//Sukurkite sąsają WorkplaceService su šiais metodais: List<Employers> getEmployers(), List<Employees> getEmployees()
//Tegul PersonFacade įgyvendina WorkplaceService sąsają. Įgyvendinimui panaudokite jau esamus PersonFacade metodus.
//Sukurkite klasę EmployersStatisticsService, kurios konstruktorius priimtų parametrą WorkplaceService
//EmployersStatisticsService klasė turėtų pateikti šiuos metodus: List<Employee> getProfitableOrganizations() ir List<Employee> getUnprofitableOrganizations()
//Sukurkite sąsają PersonEmploymentService kuri turėtų metodus List<UnemployedPerson> unemployedPersons() ir List<EmployedPerson> employedPersons()
//PersonFacade turėtų įgyvendinti PersonEmploymentService
//Sukurkite klasę UnemploymentStatisticsService kuri priimtų kaip parametrą PersonEmploymentService klasę ir turėtų šiuos metodus: int employedPersons(). int unEmployedPersons()
//PersonFacade klasė tapo atsakinga už labai daug funkcijų. Pabandykite pagal biznio logiką išskaidyti PersonFacade funkcijas į skirtingas klases, kurios įgyvendintų reikalingas sąsajas ir naudotų PersonFacade reikalingiems dėmenims gauti.
//Sukurkite statinį metodą printPerson, kuriam paduodamas Person objektas ir jo reikšmės yra išspausdinamos konsolėje. Metodas turėtų dinamiškai prisitaikyti prie objekto potipių ir atitinkamai spausdinti potipiui būdingus laukus. Naudokite šį metodą rezultatams išvesti.
//Padarykite programą efektyvesnę, įgyvendindami talpyklą (cache) PersonFacade klasėje. Talpykla veiktų taip, kad PersonFacade metodų rezultatai kurį laiką būtų saugomi PersonFacade klasėje ir skaičiavimai vyktų tik praėjus tam tikram laiko tarpui, kai saugomi įrašai tampa nebeaktualūs.

public class Main {

    public static void main(String[] args) {
	    EmployedPerson person=new EmployedPerson("545","vardas","male") ;
        System.out.println(person.getPersonalID()+"\t"+person.getName()+"\t"+person.getGender());
        UnemployedPerson person1=new UnemployedPerson("546","varde","female") ;
        System.out.println(person1.getPersonalID()+"\t"+person1.getName()+"\t"+person1.getGender());
    }
}
