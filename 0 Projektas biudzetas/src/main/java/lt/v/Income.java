package lt.v;

import java.util.ArrayList;

public class Income extends Balance {

    public Income(){
        categories.add("Salary");
        categories.add("Rent");
        categories.add("Grant");
        categories.add("Allowance");
        categories.add("Investments");
        categories.add("Gift");
        categories.add("Legacy");
        categories.add("Other");

        amounts.add(0.00);
        amounts.add(0.00);
        amounts.add(0.00);
        amounts.add(0.00);
        amounts.add(0.00);
        amounts.add(0.00);
        amounts.add(0.00);
        amounts.add(0.00);


        amount = 0;
    }


    @Override
    public void printInfo() {
        System.out.println(String.format("|%-200s|","    Income"));
        System.out.println(String.format("|%-200s|",""));
        super.printInfo();
    }


    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }



}
