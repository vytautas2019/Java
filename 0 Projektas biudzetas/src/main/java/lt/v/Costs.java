package lt.v;
public class Costs extends Balance {

    Costs(){
        categories.add("Shops");
        categories.add("Leasing");
        categories.add("House");
        categories.add("Studies");
        categories.add("Fun");
        categories.add("Car");
        categories.add("Travel");
        categories.add("Health");
        categories.add("Other");

        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);
        amounts.add(0.);

        amount = 0;
    }

    @Override
    public void printInfo() {
        System.out.println(String.format("|%-200s|","    Costs"));
        System.out.println(String.format("|%-200s|",""));
        super.printInfo();
    }


}